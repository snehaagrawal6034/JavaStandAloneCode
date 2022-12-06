package Interviews.Abstract.ConstructorAbstract;

public abstract class AbstractConstructorDemo {
    private int number1;

    public AbstractConstructorDemo(int number1) {
        this.number1 = number1;
    }

    public abstract int computeSum();

    public int getNumber1() {
        return number1;
    }
}
