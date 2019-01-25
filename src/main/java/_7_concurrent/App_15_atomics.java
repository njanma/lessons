package _7_concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * java.util.concurrent.atomic
 */
public class App_15_atomics {
    private static AtomicInteger counter = new AtomicInteger(0);
    private static volatile boolean finish1 = false;
    private static volatile boolean finish2 = false;

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10_000_000; i++) {
                counter.incrementAndGet();
            }
            finish1 = true;
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10_000_000; i++) {
                counter.incrementAndGet();
            }
            finish2 = true;
        }).start();

        while (!finish1 || !finish2) ;
        System.out.println(counter.get());
    }
}
