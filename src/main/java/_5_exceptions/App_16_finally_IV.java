package _5_exceptions;

public class App_16_finally_IV {

    public static void main(String[] args) {
        System.out.println(getI());
    }

    static int getI() {
        try {
            return 0;
        } finally {
            throw new RuntimeException();
        }
    }
}
