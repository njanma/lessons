package _5_exceptions;

public class App_13_finally_I {
    public static void main(String[] args) {
        try {
//            return;
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            // -->
        } finally {
            System.err.println("finally");
        }
    }
}
