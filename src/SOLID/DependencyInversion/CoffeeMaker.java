package SOLID.DependencyInversion;


// step -> page
// step
public class CoffeeMaker {
    public static void main(String[] args) {
        new CoffeeMaker().makeCoffee();
    }

    public void makeCoffee() {
        EspressoCoffee espressoCoffee = new EspressoCoffee(new BasicCoffee());
        espressoCoffee.prepareExpresso();
    }
}