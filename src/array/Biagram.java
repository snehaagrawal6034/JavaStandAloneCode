package array;

import java.util.ArrayList;
import java.util.List;

public class Biagram {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arrOfStr = text.split("\\s+");
        List<String> outputList = new ArrayList<>();

        for(int i=0;i<=arrOfStr.length-3 ;i++){
            if(arrOfStr[i].equals(first) && arrOfStr[i+1].equals(second)){
                outputList.add(arrOfStr[i+2]);
            }
        }
        return outputList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Biagram bp = new Biagram();
        bp.findOcurrences("alice is a good girl she is a good student","a","good");
    }
}
