package String;

public class validPalindromeTwo {

    boolean alreadyDeleted = false;
    public boolean validPalindrome(String s) {
        return validPalindrome(s, 0, s.length()-1);
    }

    public boolean validPalindrome(String s, int a, int b) {
        if (a >= b) {
            return true;
        }
        if (s.charAt(a) == s.charAt(b)) {
            return validPalindrome(s, a+1, b-1);
        } else if (!alreadyDeleted){
            alreadyDeleted = true;
            return validPalindrome(s, a, b-1) || validPalindrome(s, a+1, b);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        validPalindromeTwo test = new validPalindromeTwo();
        Boolean l=test.validPalindrome("abc");
        System.out.println(l);
    }
}
