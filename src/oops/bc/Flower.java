package oops.bc;
// bc - bouquetcompisition
public final class Flower {
    private int cost;
    private String type;

    Flower(int cost, String type) {
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
