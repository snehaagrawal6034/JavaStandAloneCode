package TryCatch;

public class RunTimeNoFormatException {

    public static void main(String[] args) {
        float c = 2;
        int finl= Integer.parseInt(String.valueOf(2));
        int i = Integer.parseInt(c + "");
        System.out.println(i);
    }
}
