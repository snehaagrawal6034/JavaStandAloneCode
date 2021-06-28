package designpattern.decorator;

public class ToppingsClass {

    public static Pizza addOnion(Pizza pizza) {
        return new Pizza() {
            @Override
            public String pizza() {
                return pizza.pizza() + " onion";
            }

            @Override
            public double cost() {
                return pizza.cost() + 0.40;
            }
        };
    }

    public static Pizza addTomato(Pizza pizza) {
        return new Pizza() {
            @Override
            public String pizza() {
                return pizza.pizza() + " tomato";
            }

            @Override
            public double cost() {
                return pizza.cost() + 0.50;
            }
        };
    }


}
