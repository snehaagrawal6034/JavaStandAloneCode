package oops.dependency.injection;

public class TestServer implements Server{
    @Override
    public String getData(String url) {
        return "test_data";
    }
}
