package ImpoCodes;

public class Fibonnaci {


    public static void main(String[] args) {
        System.out.println(fib(3));
        System.out.println(fib2(3));

    }
    // Using recursion
    public static int fib ( int n){
            //base case
            if (n == 0)
                return 0;
            if (n == 1)
                return 1;
            return fib(n - 1) + fib(n - 2);
        }

    // without recursion
    public static int fib2(int n) {
        if(n<2){
            return n;
        }

        int f0=0;
        int f1=1;
        int f=0;
        for(int i=2;i<=n;i++){
            f = f0+f1;
            f0=f1;
            f1=f;
        }
        return f;
    }
}

