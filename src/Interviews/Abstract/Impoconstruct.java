package Interviews.Abstract;

public abstract class Impoconstruct {
    int count;
    public int counter(){
        count=2;
        System.out.println(count);
        return count;
    }

    abstract void b();

    public Impoconstruct(int count) {
        this.count = count;
        System.out.println("Inside constructor:" + count);
    }

    public static void main(String[] args) {
        Impoconstruct c = new Impoconstruct(6){
            @Override
            void b() {
                System.out.println("I am anonymous inner class : b");
            }

            public void arbit() {
                counter();
                System.out.println("rer");
            }
        };
        c.counter();
        c.b();
    }
}
