package oops.dependency.injection;



public class DIPattern {

    private final Server server; // Good idea to code against interface

    //        DIPattern
    public DIPattern(Server server) {
        this.server = server;
    }

    public String getOwnData() throws InterruptedException {
        System.out.println("DI works");
        return server.getData("www.google.com");
    }

    public static void main(String[] args) throws InterruptedException {
        //        DIPattern
        DIPattern diPattern = new DIPattern(new RealServer());
        System.out.println(diPattern.getOwnData());

        // unit test code
        DIPattern diPattern1 = new DIPattern(new TestServer());
        diPattern1.getOwnData();
        System.out.println(diPattern1.getOwnData());
    }
}
