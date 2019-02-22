package _5_exceptions;

import java.util.Random;

public class App_16_finally_IV {

    public static void main(String[] args) {
        System.out.println(getI());
    }

    static int getI() {
        try {
            return new Random().nextInt();
        } finally {
            throw new RuntimeException();
        }
    }
}
