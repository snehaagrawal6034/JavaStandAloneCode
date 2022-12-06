package SOLID.dependency.inversion.principle;

public class Client {
    public static void main(String[] args) {

//        Here passing object of childclass from client and base class from reference from COffeMaker is dependency injection
        CoffeeMaker coffeeMaker = new CoffeeMaker(CoffeeFactory.filter("ThinFilter"));
        coffeeMaker.makeCoffee();
    }
}
