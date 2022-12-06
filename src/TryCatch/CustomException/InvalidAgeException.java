package TryCatch.CustomException;

// extends Exception - checked exception
// extends RuntimeException - unchecked exception
// checked exception - benefit - try, catch - explicitly
// unchecked exception - benefit - not verbose.

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super("I am a handler"+":"+ message);
        System.out.println("I am here");
    }
}
