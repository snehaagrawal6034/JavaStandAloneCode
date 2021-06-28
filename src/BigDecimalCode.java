import java.math.BigDecimal;

public class BigDecimalCode {
    public static void main(String[] args) {
        double t = 0d;
        for (int i = 0; i < 100; i++) {
            t = t + 0.2d;
        }
        System.out.println(t);
        java.math.BigDecimal bigDecimal  = new java.math.BigDecimal("0");
        for (int i = 0; i < 100; i++) {
            bigDecimal = bigDecimal.add(new java.math.BigDecimal("0.2"));
        }
        System.out.println(bigDecimal.toString());
    }
}
