package Interviews;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DupsInArray {

    public Integer[] findDupInArray(int[] arr){

        Set<Integer> s = new HashSet<>();
        List<Integer> ls = new ArrayList<>();

        for(int a : arr){
            if(s.contains(a)){
                ls.add(a);
            }
            else{
                s.add(a);
            }
        }
        System.out.println(ls);
        return ls.toArray(new Integer[]{});
    }

    public static void main(String[] args) {
        int [] arr = {1,2,4,5,2,6,7,3,8,3,4};
        DupsInArray dia = new DupsInArray();
        dia.findDupInArray(arr);
    }
}


//input:
// Output: {2,3,4}

