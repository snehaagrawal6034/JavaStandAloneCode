package oops.di;

public class DIPattern {

    private final Server server; // Good idea to code against interface

    public DIPattern(Server server) {
        this.server = server;
    }

    public String getData() throws InterruptedException {
        return server.getData("www.google.com");
    }

    public static void main(String[] args) throws InterruptedException {
        DIPattern diPattern = new DIPattern(new RealServer());
        diPattern.getData();

        // unit test code

    }
}
