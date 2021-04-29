import hashtable.singleNumber;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String str = text;
        String[] arrOfStr = str.split("\\s+");
        List<String> outputList = new ArrayList<>();

        for(int i=0;i<=arrOfStr.length-3 ;i++){
            if(arrOfStr[i].equals(first) && arrOfStr[i+1].equals(second)){
             outputList.add(arrOfStr[i+2]);
            }
        }
        System.out.println(outputList);
        Object[] arr = outputList.toArray();
        return outputList.toArray(new String[0]);
    }


    public static void main(String[] args) {
        Solution ad = new Solution();
        String text = "alice is a good girl she is a good student";
        String[] finalCalc = ad.findOcurrences(text,"a","good");
        System.out.print(finalCalc);
    }
}