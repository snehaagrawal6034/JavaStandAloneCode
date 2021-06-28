package java8;

public class DefaultSuperImpInterface implements ClickListener, ClickListener2, ClickListener3 {

    /*  1. Class can implement multiple interface but it has to override the methods if any in common else
     * use InterfaceName.super.methodname */
    //  2. Default methods inside interface provides method implemetation - Jave 8

    @Override
    public String onClick(String abc, String xyz) {
        System.out.println("returning strings");
        return null;
    }

    @Override
    public void arbit() {
        // this is inside object
        ClickListener.super.arbit();
        ClickListener2.super.arbit();
        System.out.println("this is here");
    }


    public static void main(String[] args) {
         ClickListener a =new DefaultSuperImpInterface();
         a.arbit();
         a.onClick("str1","str2");
    }
}

@FunctionalInterface
interface ClickListener {
    String onClick(String abc, String xyz);
    default void arbit() {
        System.out.println("i ma here");
    }
}

interface ClickListener2 {
    default void arbit() {
        System.out.println("you are there");
    }
}

interface ClickListener3 {
}
