import com.hcl.drinks.DrinksEntity;
import com.hcl.hibernate.HibernateUtils;
import org.hibernate.Session;

public class Main {
    static Session hibernateSession;

    public static void main(String[] args) {
        try {
            hibernateSession = HibernateUtils
                    .buildSessionFactory()
                    .openSession();
            hibernateSession.beginTransaction();


            for (int i = 0; i <= 10; i++) {
                DrinksEntity drinks = new DrinksEntity();
                drinks.setName("Drink" + i);
                drinks.setIs_good(true);
                drinks.setPrice(10F * i);
                hibernateSession.save(drinks);
            }

            hibernateSession.getTransaction().commit();
        } catch(Exception sqlException) {
            if (null != hibernateSession.getTransaction()) {
                hibernateSession.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if (hibernateSession != null) {
                hibernateSession.close();
            }
        }

    }
}
