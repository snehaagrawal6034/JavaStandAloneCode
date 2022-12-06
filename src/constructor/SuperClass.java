package constructor;

public class SuperClass {

    public SuperClass(int a) {
        System.out.println("I am a parameterized parent");
    }

    public SuperClass() {
        System.out.println("I am a default parent");
    }

    public  void printVal(){
        System.out.println("I am in parent class");
    }
}
