package _5_exceptions;

public class App_14_finally_II {
    public static void main(String[] args) {
        try {
//            Runtime.getRuntime().exit(666);
            System.exit(666);
        } finally {
            System.err.println("finally");
        }
    }
}
