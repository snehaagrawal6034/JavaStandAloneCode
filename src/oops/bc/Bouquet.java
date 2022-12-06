package oops.bc;

import java.util.ArrayList;
import java.util.List;

public final class Bouquet {
    private final List<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
        System.out.println(flowers);
    }

    // r, r, r, r, l
    public int cost() {
        int cost = 0;
        String type = null;
        for (Flower flower : flowers) {
            cost = cost + flower.getCost();
            type = flower.getType();
            System.out.println(type);
        }
        return cost;
    }
}
