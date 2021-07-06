package array;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int ans = 0;
        int[] count = new int[128];

        for (char c : s.toCharArray()) {
            count[c]++;
        }

        for (int i : count) {
            ans += i / 2 * 2;
            if (i % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestPalindrome ts = new LongestPalindrome();
        String s1 = "thisappleissweet";
        int res = ts.longestPalindrome(s1);
        System.out.println(res);
    }
}
