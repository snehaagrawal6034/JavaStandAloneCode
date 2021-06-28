package designpattern;

public final class Singleton {
//    private static final Singleton VAL = new Singleton();

    private Singleton() {
        // Some things to do.
    }

//    public static Singleton getInstance() {
//        return VAL;
//    }

    private static Singleton INSTANCE;
    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
