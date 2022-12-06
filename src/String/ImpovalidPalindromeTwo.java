package String;

public class ImpovalidPalindromeTwo {

    boolean alreadyDeleted = false;
    public boolean validPalindrome(String s) {
        return validPalindromeInternal(s, 0, s.length()-1);
    }

    public boolean validPalindromeInternal(String s, int start, int end) {
        if(start>=end) {
            return true;
        }
        if(s.charAt(start) == s.charAt(end)) {
            return validPalindromeInternal(s, start+1, end-1);
        } else {
            if(alreadyDeleted) {
                return false;
            }
            alreadyDeleted = true;
            return validPalindromeInternal(s, start, end-1) || validPalindromeInternal(s, start+1, end);
        }
    }

    public static void main(String[] args) {
        ImpovalidPalindromeTwo test = new ImpovalidPalindromeTwo();
        Boolean l=test.validPalindrome("abca");
        System.out.println(l);
    }
}
