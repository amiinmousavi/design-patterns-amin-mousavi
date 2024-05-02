package factory.webFrameworks.matcha;

import factory.webFrameworks.ViewEngine;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context) {
        var engine = createViewEngine();
        var html = engine.render(viewName, context);
        System.out.println(html);
    }

    protected ViewEngine createViewEngine() {
        return new MatchaViewEngine();
    }
}
