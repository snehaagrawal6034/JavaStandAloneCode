package String;

import java.util.Arrays;

public class BuddyString {
        public boolean buddyStrings(String A, String B) {
            if(A.length()!=B.length()){
                return false;
            }
                    // aaba
                    // aaba
            if(A.equals(B)) {
                int[] charCount = charCount(A);
                for(int i=0; i<26;i++) {
                    if(charCount[i]>=2) {
                        return true;
                    }
                }
                return false;
            }
            int counter = 0;
            if(!compareArray(charCount(A),charCount(B))){
                return false;
            }
            for(int i=0;i<A.length();i++){
                if(A.charAt(i)!=B.charAt(i)){
                    counter++;
                }
            }

// counter - 0 - same string, charcount > 2
// ab
// ba
// aba
// aba
// counter - 0
// ab, ab - 0 - false
// aba, aba - 0 - true
            return counter == 2;
        }

        private int[] charCount(String str){
            char ch[] = str.toCharArray();
            int counter[] = new int[26];
            for(int i=0;i<ch.length;i++){
                counter[ch[i]-'a']++;
            }
            return counter;
        }

        private boolean compareArray(int[] a, int[] b) {
            for(int i=0;i<26;i++) {
                System.out.println(a[i] + " " + b[i]);
                if(a[i] != b[i]) {
                    return false;
                }
            }
            return true;
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
