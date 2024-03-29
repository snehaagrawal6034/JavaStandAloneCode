package array;

import java.util.HashSet;
import java.util.Set;

public class DoubleExist {
        public boolean checkIfExist(int[] arr) {

            Set<Integer> s = new HashSet();

            for (int num: arr) {

                if(s.contains(num*2) || (s.contains(num/2))){
                    return true;
                }
                s.add(num);
            }

            return false;
        }
    public static void main(String[] args) {
        DoubleExist ad = new DoubleExist();
        int[] nums = new int[]{2,3,5,2,6};
         boolean b=ad.checkIfExist(nums);
            System.out.print(b);
    }
    }
// [2,4,9,64,8]
