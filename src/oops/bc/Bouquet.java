package oops.bc;

import java.util.ArrayList;
import java.util.List;

public final class Bouquet {
    private final List<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    // r, r, l, l, l
    public int cost() {
        int cost = 0;
        for (Flower flower : flowers) {
            cost = cost + flower.getCost();
        }
        return cost;
    }
}
