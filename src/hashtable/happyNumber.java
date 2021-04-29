package hashtable;

import array.FindCommonChars;

import java.util.HashSet;
import java.util.Set;

public class happyNumber {
        public boolean isHappy(int n) {
            Set<Integer> set = new HashSet<>();

            set.add(n);
            while(n != 1) {
                n = computeSquare(n);
                if(set.contains(n)) {
                    return false;
                }
                set.add(n);
            }

            return true;
        }

        private int computeSquare(int n) {
            int computeSquare = 0;
            while(n != 0) {
                int digit = n%10;
                computeSquare = computeSquare + digit * digit;
                n = n/10;
            }
            return computeSquare;
        }

    public static void main(String[] args) {
        happyNumber hm = new happyNumber();
        int n=21;
        if (!hm.isHappy(n)) {
            throw new RuntimeException(n +" is not happy");
        }
    }
}
