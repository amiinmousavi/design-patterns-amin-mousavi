package factory.webFrameworks;

import factory.webFrameworks.matcha.Controller;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
    public void listProducts() {
        // get products from a database
        Map<String, Object> context = new HashMap<>();

        // context.put(products)
        render("products.html", context);
    }
}
