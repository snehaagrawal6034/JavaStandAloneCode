package hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MissingNums {
    public List<Integer> numDisappearArr(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return new ArrayList();
        }
        List<Integer> missingnums = new ArrayList<Integer>();
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int i : nums) {
            numbers.add(i);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!numbers.contains(i)) {
                missingnums.add(i);
            }
        }
        return missingnums;
    }

    public static void main(String[] args) {
        MissingNums abc = new MissingNums();
        System.out.println(abc.numDisappearArr(new int[]{5,1,2,7,10,3,14,10,10}));
    }
}

//        System.out.println(c);
// [17,17,18,5,4,6,1] [18,6,6,6,6,-1]


