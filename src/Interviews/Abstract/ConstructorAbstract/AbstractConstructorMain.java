package Interviews.Abstract.ConstructorAbstract;

public class AbstractConstructorMain {
    public static void main(String[] args) {
        ConcreteConstructorDemo concreteConstructorDemo = new ConcreteConstructorDemo(1,2);
        System.out.println(concreteConstructorDemo.computeSum());
    }
}
