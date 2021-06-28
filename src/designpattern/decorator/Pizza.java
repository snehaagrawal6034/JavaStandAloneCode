package designpattern.decorator;

public interface Pizza {

    String pizza();

    double cost();

    public static void main(String[] args) {
        Pizza pizza = new WholeWheatPizza();
        System.out.println(ToppingsClass.addTomato(ToppingsClass.addOnion(pizza)));
    }
}
