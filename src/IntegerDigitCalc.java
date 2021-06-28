public class IntegerDigitCalc {
    public static void main(String[] args) {
        int i = 145;
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
        int num = 0;
        while(i != 0) {
            num = num * 10 + (i%10);
            i = i/10;
        }
        System.out.println(num);
    }
}
