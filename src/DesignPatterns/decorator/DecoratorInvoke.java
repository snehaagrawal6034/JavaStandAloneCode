package DesignPatterns.decorator;

// Decorator patterns allow a user to add new functionality to an existing object without altering its structure. So, there is no change to the original class.
//The decorator design pattern is a structural pattern, which provides a wrapper to the existing class.
//The decorator design pattern uses abstract classes or interfaces with the composition to implement the wrapper.
//Decorator design patterns create decorator classes, which wrap the original class and supply additional functionality by keeping the class methods’ signature unchanged.
//Decorator design patterns are most frequently used for applying single responsibility principles since we divide the functionality into classes with unique areas of concern.
//The decorator design pattern is structurally almost like the chain of responsibility pattern.

//Decorator design pattern is useful in providing runtime modification abilities and hence more flexible. Its easy to maintain and extend when the amount of choices are more.
//The disadvantage of decorator design pattern is that it uses plenty of similar kind of objects (decorators)
//Decorator pattern is used a lot in Java IO classes, like FileReader, BufferedReader, etc.

public class DecoratorInvoke {
    public static void main(String[] args) {
        Shape shape = new ShinyDecorator(new RedDecorator(new Circle()));
        System.out.println(shape);

        System.out.println(shape.draw());
    }
}
