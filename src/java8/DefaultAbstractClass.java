package java8;

public abstract class DefaultAbstractClass {
    String adsds;

    public DefaultAbstractClass(String adsds) {
        this.adsds = adsds;
    }

    abstract void abstractMethod();

    void defaultMethod() {
        System.out.println("this method is default"  + adsds);
    }
}
