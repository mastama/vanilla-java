package exception;

public class ValidationUtil {

    public static void validate(LoginRequest request) throws ValidationException, NullPointerException {
        if (request.getUsername() == null || request.getUsername().equals("")) {
            throw new NullPointerException("Username is null");
        } else if (request.getUsername().isBlank() || request.getUsername().isEmpty()) {
            throw new ValidationException("Username is blank");
        } else if (request.getPassword() == null || request.getPassword().equals("")) {
            throw new NullPointerException("Password is null");
        } else if (request.getPassword().isBlank() || request.getPassword().isEmpty()) {
            throw new ValidationException("Password is blank or empty");
        }
    }

    /**
     * Runtime exeption bisa digunakna tanpa perlu deklrasi throws ...
     */
    public static void validateRuntime(LoginRequest request) {
        if (request.getUsername() == null || request.getUsername().equals("")) {
            throw new NullPointerException("Username is null");
        } else if (request.getUsername().isBlank() || request.getUsername().isEmpty()) {
            throw new RuntimeException("Username is blank");
        } else if (request.getPassword() == null || request.getPassword().equals("")) {
            throw new NullPointerException("Password is null");
        } else if (request.getPassword().isBlank() || request.getPassword().isEmpty()) {
            throw new RuntimeException("Password is blank or empty");
        }
    }
}
