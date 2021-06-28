package java8;

import java.util.ArrayList;
import java.util.List;

public class TypeInference {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        TypeInference.showList(new ArrayList<>());
    }
    public static void showList(List<Integer> list){
    }
}
