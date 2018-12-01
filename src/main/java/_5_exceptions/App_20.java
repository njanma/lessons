package _5_exceptions;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App_20 {
    public static void main(String[] args) throws IOException, InterruptedException {
        f0();
        f1();
        f2();
    }

    static void f0() throws EOFException {
        throw new EOFException();
    }

    static void f1() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    static void f2() throws InterruptedException {
        throw new InterruptedException();
    }
}
