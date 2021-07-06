package epam.code.bouquet.factory.compostion;

public final class Flower {

    private int cost;
    private String type;

    public Flower(int cost, String type) {
        this.cost = cost;
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }
}
