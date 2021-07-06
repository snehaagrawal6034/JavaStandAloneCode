package oops.dependency.injection;

public class RealServer implements Server {

    public String getData(String url) throws InterruptedException {
        // some implementation;
        Thread.sleep(5000);
        return "actual_Response";
    }
}
