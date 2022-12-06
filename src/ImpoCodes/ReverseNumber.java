package ImpoCodes;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 145;
        // 123%10=3
        // 123/10 = 12
        // 659 = 65
        // 145%10=5
        // 145/10 = 14
        // 14%10=4
        // 14/10=1
        //1%10=1
        // 1/10=0
        // 0*10+5=5
        // 5*10+4
        //54*10+1
        int sum = 0;
        while(num != 0) {
            int r = num%10;
            sum = sum * 10 + r;
            num = num/10;
        }
        System.out.println(sum);
    }
}
