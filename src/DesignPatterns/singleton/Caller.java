package DesignPatterns.singleton;

public class Caller {
    public static void main(String[] args) {
        SingletonDP singleton1 = SingletonDP.getInstance();
        SingletonDP singleton2 = SingletonDP.getInstance();
    }
}
