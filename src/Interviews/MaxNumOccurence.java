package Interviews;

import java.util.HashMap;
import java.util.Map;

public  class MaxNumOccurence {

    public static int dupEle(int a[]){
        Map<Integer,Integer> hm = new HashMap<>();
        int counter = 0;

        for(int b : a) {

            hm.put(b, hm.getOrDefault(b, 0) + 1);
        }
//        (1,2) ,(2,3), (3,1), (4,1), (6,2)
        int maxKey = 0;
        int maxOccur = 0;

        for(Map.Entry<Integer,Integer> me : hm.entrySet()){
            if(me.getValue() > maxOccur){
                maxOccur = me.getValue();
                maxKey = me.getKey();
            }
        }
        return maxKey;
    }


    public static void main(String[] args) {
   int a[] = {1,1,2,2,2,3,4,6,6};
        System.out.println(dupEle(a));
    }
}
