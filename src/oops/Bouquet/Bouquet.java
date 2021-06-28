package oops.Bouquet;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        for (int i = 0; i < 5; i++) {
            bouquet.addRose();
        }
        for (int i = 0; i < 5; i++) {
            bouquet.addLily();
        }
        System.out.println(bouquet.cost());
    }

    private List<Flower> flowers = new ArrayList<>();

    public void addRose() {
        flowers.add(new Rose());
    }

    public void addLily() {
        flowers.add(new Lily());
    }

    public double cost() {
        double cost = 0;
        for (Flower flower : flowers) {
            cost = cost + flower.cost();
        }
        return cost;
    }

    class Rose implements Flower {

        @Override
        public double cost() {
            return 1.0;
        }
    }

    class Lily implements Flower {

        @Override
        public double cost() {
            return 2.0;
        }
    }

    interface Flower {
        double cost();
    }

    // rose, lily, rose, lily, lily
    // 2+1+2+1+!

    // TODO - Builder pattern.
//    public Bouquet(int roseCount, int lilyCount) {
//        for (int i = 0; i < roseCount; i++) {
//            flowers.add(new Rose());
//        }
//        for (int i = 0; i < lilyCount; i++) {
//            flowers.add(new Lily());
//        }
//    }
}
