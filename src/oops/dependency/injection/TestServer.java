package oops.dependency.injection;

public class TestServer implements Server{
    @Override
    public String getData(String url) {
        System.out.println("I am a test server");
        return "test_data";
    }
}
