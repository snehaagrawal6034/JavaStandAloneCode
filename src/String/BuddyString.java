package String;

import java.util.Arrays;

public class BuddyString {
    public boolean buddyStrings(String A, String B) {

        if (A.length() != B.length()) {
            return false;
        }
        if (A.equals(B)) {
            int[] ab = new int[26];
            for (int i = 0; i < A.length(); i++) {
                ab[A.charAt(i) - 'a']++;
            }
            for (int count : ab) {
                if (count > 1) {
                    return true;
                }
            }
            return false;
        } else {
            int first = -1;
            int second = -1;
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }
            return (second != -1 && A.charAt(first) == B.charAt(second) && A.charAt(second) == B.charAt(first));
        }
    }
    public static void main(String[] args) {
        BuddyString bs = new BuddyString();
        Boolean bol = bs.buddyStrings("aaaaaaabc", "aaaaaaacb");
        System.out.println(bol);

    }
}

//condition 1 : length not equal - return false;
//condition 2 : length same and string exactly same , check the count of chars(if any char > 1 return true , else return false)
//condition 3 : length same but string not exactly same , f=-1 , s=-1 (when first mismatch update first with the index ,
// when f!=-1 and mismatch happens again update index of second , now A[first] == B[second]
// and vice versa and second!=1 then true else false)
