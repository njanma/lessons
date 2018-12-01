package _5_exceptions;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class App_21 {
    // EOFException перехватили catch-ом, им не пугаем
    public static void main(String[] args) throws FileNotFoundException {
        try {
            if (System.currentTimeMillis() % 2 == 0) {
                throw new EOFException();
            } else {
                throw new FileNotFoundException();
            }
        } catch (EOFException ignore) {
            // ...
        }
    }
}
