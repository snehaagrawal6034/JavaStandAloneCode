package ImpoCodes;

import java.math.BigDecimal;

public class BigDecimalCode {
    public static void main(String[] args) {
        double t = 0d;
        for (int i = 0; i < 100; i++) {
            t = t + 0.2d;
        }
        System.out.println(t);
        BigDecimal bigDecimal  = new BigDecimal("0");
        for (int i = 0; i < 100; i++) {
            bigDecimal = bigDecimal.add(new BigDecimal("0.2"));
        }
        System.out.println(bigDecimal.toString());
    }
}
//