package Interviews.Abstract.ConstructorAbstract;

import Interviews.Abstract.ConstructorAbstract.AbstractConstructorDemo;

public class ConcreteConstructorDemo extends AbstractConstructorDemo {
    private int number2;

    public ConcreteConstructorDemo(int number1, int number2) {
        super(8);
        this.number2 = number2;
    }

    @Override
    public int computeSum() {
        return number2 + getNumber1();
    }
}
