public class LoginException extends Exception {
    public LoginException() {
        super("Login Invalido");
    }

    public LoginException(String message) {
        super(message);
    }
}
