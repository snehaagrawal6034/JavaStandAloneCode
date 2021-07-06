package designpattern;

public final class Singleton {
//    private static final Singleton VAL = new Singleton();

    private Singleton() {
        System.out.println("Hey , I am Singleton");
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
