package oops.dependency.injection;

public interface Server {
    String getData(String url) throws InterruptedException;
}
