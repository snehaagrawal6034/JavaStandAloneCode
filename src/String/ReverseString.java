package String;

public class ReverseString {
    // this is a string
    // siht si a gnirts
    public static void main(String[] args) {
        String s = "this is a string";
        String[] str = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s1 : str) {
            stringBuilder.append(new StringBuilder(s1).reverse());
            stringBuilder.append(" ");


        }
        System.out.println(stringBuilder.substring(0, stringBuilder.length() - 1));
    }
}
