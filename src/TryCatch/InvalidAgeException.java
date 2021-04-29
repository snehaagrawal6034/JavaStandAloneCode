package TryCatch;

// extends Exception - checked exception
// extends RuntimeException - unchecked exception
public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String message) {
        super(message);
    }
}
