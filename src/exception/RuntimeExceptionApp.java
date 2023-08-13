package exception;

public class RuntimeExceptionApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("", "");

        ValidationUtil.validateRuntime(loginRequest);
        System.out.println("SUskes");
    }
}
