package DesignPatterns.decorator;

public class Circle implements Shape{
    @Override
    public String draw() {
        return "circle ";
    }

    @Override
    public String toString() {
        return draw();
    }
}
