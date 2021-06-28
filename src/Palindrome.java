public class Palindrome {

//    public static boolean isPalindrome(int n){
//        return reverse(n) == n;
//    }

//    public static int reverse(int n) {
//        // 102
//        // 201
//        // 102 = 1*100+0*10+2*1
//    }

    public static boolean isPalindrome(String n){
//        StringBuilder builder = new StringBuilder(n);
//        String reverse = builder.reverse().toString();
//        return n.equals(reverse);
        int start = 0, end = n.length()-1;
        while (start <= end) {
            if (n.charAt(start) == n.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 121
        // 1221
        // reverse(number) == number
        // reverse(string) == string
        Palindrome pl = new Palindrome();
        System.out.println(pl.isPalindrome("abc"));
    }
}
