package designpattern.dependencyinversion;


// step -> page
// step
public class CoffeeMaker {
    public static void main(String[] args) {
        new CoffeeMaker().makeCoffee();
    }

    public void makeCoffee() {
        EspressoCoffee espressoCoffee = new EspressoCoffee(new BasicCoffeeNew());
        espressoCoffee.prepareExpresso();
    }
}

// Bol do I am outside with some work.