package epam.code.bouquet.factory.compostion;

import java.util.ArrayList;
import java.util.List;

public final class Bouquet {

    private final List<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower){
        flowers.add(flower);
    }

    public int cost(){
        int cost = 0;
        for(Flower flr : flowers){
            cost = cost + flr.getCost();
        }
        return cost;
    }
}
