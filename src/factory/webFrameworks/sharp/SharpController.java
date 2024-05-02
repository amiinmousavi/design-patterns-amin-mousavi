package factory.webFrameworks.sharp;

import factory.webFrameworks.ViewEngine;
import factory.webFrameworks.matcha.Controller;

public class SharpController extends Controller {

    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
