public class Prime {

    public static boolean isPrime(int n){

        if(n==1){
            return false;
        }
        // 1 to n - only 2 numbers cleanly divide
        // 2 to n-1 - can't be divided by anything.


        for (int i = 2; i <= n/2; i++) {
            if(n%i == 0) {
                return false;
            }
        } // o(n)
        return true;
    }

    public static void main(String[] args) {
        Prime pl = new Prime();
        System.out.println(pl.isPrime(13));
    }
}


