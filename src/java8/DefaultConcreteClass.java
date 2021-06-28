package java8;

public class DefaultConcreteClass extends DefaultAbstractClass {
    public DefaultConcreteClass(String adsds) {
        super(adsds);
    }

    @Override
    void abstractMethod() {
    }

    @Override
    void defaultMethod() {
        super.defaultMethod();
    }
}
