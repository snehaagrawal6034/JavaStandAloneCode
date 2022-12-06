package oops.dependency.injection;

public class RealServer implements Server {

    public String getData(String url) throws InterruptedException {
        // some implementation;
        Thread.sleep(1000);
        System.out.println(url+" real Server");
        return "actual_Response";
    }
}
