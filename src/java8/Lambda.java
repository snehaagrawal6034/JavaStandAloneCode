package java8;

import java.util.Arrays;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        ClickListen clickListener = new ClickListen() {
            @Override
            public String onClick(String abc,String def) {

              return "clicklistener1" + abc + def;
            }
        };

        ClickListen clickListener2 = (abc, xyz) -> "clicklistner2" + abc + xyz;
        ClickListen clickListener3 = (abc, xyz) -> {
            return "clicklistener3" + abc + xyz;
        };
//        ClickListen clickListener = (abc, xyz) -> null;

        System.out.println(clickListener2.onClick("xyz", "def"));
        System.out.println(clickListener.onClick("xyz", "abc"));
        System.out.println(clickListener3.onClick("ssd", "SDsd"));

    }
}
@FunctionalInterface
interface ClickListen {
        String onClick(String abc, String xyz);
        default void arbit() {
            System.out.println("i ma here");
        }
    }
