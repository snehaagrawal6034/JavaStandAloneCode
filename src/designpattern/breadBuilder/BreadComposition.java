package designpattern.breadBuilder;

public class BreadComposition {

    private int height;
    private int width;
    private int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int carb;
    private boolean milkBread;

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

        public Builder setFat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder setSodium(int sodium) {
            this.sodium = sodium;
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
}
