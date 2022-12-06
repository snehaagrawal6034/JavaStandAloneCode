package ImpoCodes;

public class NumberPalindrome {

    public boolean isPalindrome(int n) {

        int temp = n;
        int r;
        int sum = 0;

        while (n > 0) {

            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println(sum);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int num = 121;
        NumberPalindrome np = new NumberPalindrome();
        np.isPalindrome(num);

    }
}
