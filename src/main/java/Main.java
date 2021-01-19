import com.hcl.DrinksDAO;
import com.hcl.DrinksDAOImpl;
import com.hcl.DrinksDTO;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DrinksDAO drinksDAO = new DrinksDAOImpl();
        drinksDAO.create(new DrinksDTO(
                "orange juice",
                true
        ));
        List<DrinksDTO> drinks = drinksDAO.getAll();
        drinks.forEach((d) -> System.out.println(d.toString()));

    }
}
