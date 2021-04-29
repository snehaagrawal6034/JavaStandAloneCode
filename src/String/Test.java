package String;

public class Test {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        sb.append(n);


        for (int i = sb.length() - 1; i > 0; i--) {
            counter++;
            if (counter == 3) {
                sb.insert(i, ".");
                counter = 0;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Test test = new Test();
        String  l = test.thousandSeparator(123456789);
        System.out.println(l);
    }
}
