package ImpoCodes;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/occurrences-after-bigram/
class FindOcurrences {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arrOfStr = text.split("\\s+");
        List<String> outputList = new ArrayList<>();

        for(int i=0;i<arrOfStr.length-2 ;i++){
            if(arrOfStr[i].equals(first) && arrOfStr[i+1].equals(second)){
             outputList.add(arrOfStr[i+2]);
            }
        }
        System.out.println(outputList);
        return outputList.toArray(new String[0]);
    }


    public static void main(String[] args) {
        FindOcurrences ad = new FindOcurrences();
        String text = "alice is a good girl she is a good student";
        String[] finalCalc = ad.findOcurrences(text,"a","good");
        System.out.print(finalCalc);
    }
}