package exception;

public class ExceptionApp {
    public static void main(String[] args) {

        // instance object
        LoginRequest loginRequest = new LoginRequest("Singgih", "485484");
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid. Anda berhasil Login");
            //menggunakan lebih dari 1 exception (multiple exception)
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Data tidak valid: " + e.getMessage());
        } finally {
            System.out.println("Block ini akan selalu di eksekusi mau success ataupun gagal");
        }
    }
}
