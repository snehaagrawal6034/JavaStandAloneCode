package array;

import java.util.ArrayList;
import java.util.List;

public class PracticeFindCommonChars {
    public List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        if (A == null || A.length == 0) {
            return result;
        }
        int[] min = charCount(A[0]);
        for (int i = 1; i < A.length; i++) {
            int[] localCount = charCount(A[i]);
            for (int j = 0; j < 26; j++) {
                if (min[j] > localCount[j]) {
                    min[j] = localCount[j];
                }
            }
        }
        char c = 'a';

        for (int i = 0; i < min.length; i++) {
            char c2 = (char) (c + i);
            System.out.print(c2 + "\t");
            System.out.println(min[i]);
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < min[i]; j++) {
                result.add(String.valueOf(c));
            }
            c += 1;
        }
        System.out.println(result);
        return result;
    }

    private int[] charCount(String chars) {
        int[] nums = new int[26];
        char[] ch = chars.toCharArray();
        for (char c : ch) {
            nums[c - 'a']++;
        }
        return nums;
    }

    public static void main(String[] args) {
        PracticeFindCommonChars ts = new PracticeFindCommonChars();
        String[] str = {"bella", "label", "roller"};
        ts.commonChars(str);
    }
}
