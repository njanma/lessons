package _5_exceptions;

public class App_15_finally_III {

    public static void main(String[] args) {
        System.out.println(getI());
    }

    static int getI() {
        try {
            if (true) {
                throw new IllegalAccessException();
            }
            return 25;
        } finally {
            return 15;
        }
    }
}
