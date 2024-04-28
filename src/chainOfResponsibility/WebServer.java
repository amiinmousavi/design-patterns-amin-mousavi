package chainOfResponsibility;

public class WebServer {
    public void handle(HttpRequest request) {
        // Authentication
        var authenticator = new Authenticator();
        authenticator.authenticate(request);

        // Logigng

        // Compression
    }
}
