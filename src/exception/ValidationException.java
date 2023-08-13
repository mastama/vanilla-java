package exception;

public class ValidationException extends Throwable{

    // di java ini disebut checkValidation
    public ValidationException(String message) {
        super(message);
    }
}
