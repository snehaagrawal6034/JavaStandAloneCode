package SOLID.OpenClose;

public class AnimalClient {
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println(animal.sound());

        Animal animal1 = new Cat();
        System.out.println(animal1.sound());
    }
}
