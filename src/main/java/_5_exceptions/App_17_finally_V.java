package _5_exceptions;

public class App_17_finally_V {

    public static void main(String[] args) {
        System.out.println(getI());
    }

    static int getI() {
        try {
            throw new Error();
        } finally {
            throw new RuntimeException();
        }
    }
}
