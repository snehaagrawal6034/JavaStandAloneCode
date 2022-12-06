package DesignPatterns.decorator;

public class Rectangle implements Shape {

    @Override
    public String draw() {
        return "rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
