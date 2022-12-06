package array;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int ans = 0;
        int[] count = new int[26];
        // a - 0, b-1

        // abbb
        // bab
       // [1, 3,        0]
        for (char c : s.toCharArray()) {
            count[c-'a']++; // 1
         }

        for(int i=0; i<count.length;i++) {
            char c = (char) (i + 'a');
            System.out.println("character  " + c + " count " + count[i]);
        }

        // bbb - a/2*2 -> a , a/2*2 - (a-1) a odd
        for (int i : count) {
            ans += i / 2 * 2;
        }
        if (ans < s.length()) {
            ans++;
        }
        return ans;
    }

        //** second method **//

    // Map<Character,Integer> charCount = new HashMap<>();
    // for(char c : s.toCharArray()){
    //       charCount.put(c, charCount.getOrDefault(c,0)+1);
    // }

    //    int count = 0;
    //    boolean oddFound = false;

    //  for(Map.Entry<Character,Integer> entry : charCount.entrySet()){
    //      if(entry.getValue()%2==0){
    //          count = count + entry.getValue();
    //      } else{
    //          count = count + entry.getValue()-1;
    //          oddFound = true;
    //      }
    //  }
    //  if(oddFound){
    //     count++;
    //  }
    //     return count;
    // }

    public static void main(String[] args) {
        LongestPalindrome ts = new LongestPalindrome();
//        String s1 = "aaaaabbb";
        String s1 = "appleissweet";
        int res = ts.longestPalindrome(s1);
        System.out.println(res);
    }
}
