package designpattern;

public class Load {

    private Load() {

    }

    public static class LoadSub extends Load {
        public static void main(String[] args) {
            Load load1 = new Load();
            Load load2 = new Load();
        }
    }
}
