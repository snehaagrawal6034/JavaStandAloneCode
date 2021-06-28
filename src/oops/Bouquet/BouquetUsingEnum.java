package oops.Bouquet;

import java.util.ArrayList;
import java.util.List;

public class BouquetUsingEnum {

    public static void main(String[] args) {
        BouquetUsingEnum bouquet  = new BouquetUsingEnum(5, 0);
        for (int i = 0; i < 5; i++) {
            bouquet.addRose();
        }
        for (int i = 0; i < 5; i++) {
            bouquet.addLily();
        }
        System.out.println(bouquet.cost());
    }

    private List<Flower> flowers = new ArrayList<>();
    // rose, lily, rose, lily, lily
    // 2+1+2+1+!

    // TODO - Builder pattern.
    // enum is singleton
    public BouquetUsingEnum(int roseCount, int lilyCount) {
        for (int i = 0; i < roseCount; i++) {
            flowers.add(FlowerImpl.ROSE);
        }
        for (int i = 0; i < lilyCount; i++) {
            flowers.add(FlowerImpl.LILY);
        }
    }

    public void addRose() {
        // implement it.
    }

    public void addLily() {

    }

    public double cost() {
        double cost = 0;
        for (Flower flower : flowers) {
            cost = cost + flower.cost();
        }
        return cost;
    }

    enum FlowerImpl implements Flower {
        ROSE(2),
        LILY(1);

        private final double cost;

        FlowerImpl(double cost) {
            this.cost = cost;
        }

        @Override
        public double cost() {
            return cost;
        }
    }

    interface Flower {
        double cost();
    }
}
