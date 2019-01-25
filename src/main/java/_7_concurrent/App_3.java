package _7_concurrent;

import java.time.LocalTime;

public class App_3 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
            System.out.println("A: " + LocalTime.now().getSecond());
            printB();
        }
    }

    static void printB() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("B: " + LocalTime.now().getSecond());
    }
}
