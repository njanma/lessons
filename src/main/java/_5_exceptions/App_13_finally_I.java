package _5_exceptions;

public class App_13_finally_I {
    public static void main(String[] args) {
        try {
            return;
//            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
    }
}
