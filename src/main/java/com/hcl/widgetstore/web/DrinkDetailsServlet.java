package com.hcl.widgetstore.web;

import com.hcl.drinks.DrinksEntity;
import com.hcl.hibernate.HibernateUtils;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DrinkDetailsServlet extends HttpServlet {

    Session session;

    public void init() {
        session = HibernateUtils.buildSessionFactory().openSession();
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<form action='' method='POST'>");
        out.println("<label>Enter Product (Drink) ID: <input type='text' name='drink-id'></input></label>");
        out.println("<input type='submit'>Get Details</input>");
        out.println("</form>");
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        String drinkId = request.getParameter("drink-id");
        PrintWriter out = response.getWriter();

        DrinksEntity drinksEntity = session.get(
                DrinksEntity.class,
                Long.parseLong(drinkId)
        );
        if (drinksEntity != null) {
            out.println("Found drink: " + drinksEntity.getName() + " with price: " + drinksEntity.getPrice() + " is it good: " + drinksEntity.getIs_good());
        } else {
            out.println("No drink found for id: " + drinkId);
        }
    }


}
