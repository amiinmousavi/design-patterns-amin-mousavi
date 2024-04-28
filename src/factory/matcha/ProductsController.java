package factory.matcha;

import factory.Controller;
import factory.MatchaViewEngine;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
    public void listProducts() {
        // get products from a database
        Map<String, Object> context = new HashMap<>();

        // context.put(products)
        render("products.html", context, new MatchaViewEngine());
    }
}
