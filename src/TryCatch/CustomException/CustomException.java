package TryCatch.CustomException;

public class CustomException {

    static void validate(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("I am throwing exception");
        } else {
            System.out.println("Eligible for vote");
        }
    }

    public static void main(String[] args) throws Exception{

        try {
            validate(10);
        } catch (InvalidAgeException ae) {
            System.out.println("I am handling exception" + ae);
        }
    }
}
