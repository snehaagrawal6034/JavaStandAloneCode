package DesignPatterns.breadBuilder;

public class BreadComposition {

    private final int height;
    private final int width;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carb;
    private final boolean milkBread;

    private BreadComposition(Builder builder) {
        this.height = builder.height;
        this.width = builder.width;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carb = builder.carb;
        this.milkBread = builder.milkBread;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarb() {
        return carb;
    }

    public boolean isMilkBread() {
        return milkBread;
    }

    public static final class Builder {
        private int height;
        private int width;
        private int servings;
        private int calories;
        private int fat;
        private int sodium;
        private int carb;
        private boolean milkBread;

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder setWidth(int width) {
            this.width = width;
            return this;
        }

        public Builder setServings(int servings) {
            this.servings = servings;
            return this;
        }

        public Builder setCalories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder setCarb(int carb) {
            this.carb = carb;
            return this;
        }

        public Builder setMilkBread(boolean milkBread) {
            this.milkBread = milkBread;
            return this;
        }

        public BreadComposition build() {
            return new BreadComposition(this);
        }
    }

    @Override
    public String toString() {
        return "BreadComposition{" +
                "height=" + height +
                ", width=" + width +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carb=" + carb +
                ", milkBread=" + milkBread +
                '}';
    }
}
