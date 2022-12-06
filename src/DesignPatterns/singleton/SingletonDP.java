package DesignPatterns.singleton;

public final class SingletonDP {
//    private static final Singleton VAL = new Singleton();  -- Early Initialization

    private SingletonDP() {

    }

//    public static Singleton getInstance() {
//        return VAL;
//    }

    // Lazy Initialization
    private static SingletonDP INSTANCE;
    public static synchronized SingletonDP getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonDP();
        }
        return INSTANCE;
    }
}

