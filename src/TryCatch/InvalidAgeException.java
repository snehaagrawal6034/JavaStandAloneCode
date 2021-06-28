package TryCatch;

// extends Exception - checked exception
// extends RuntimeException - unchecked exception
// checked exception - benefit - try, catch, throw - explicitly
// unchecked exception - benefit - not verbose.
public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Object o = "sds";
        System.out.println(o.hashCode());
    }
}
