package _7_multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App_17_try_lock {
    private static volatile int counter = 0;
    private static volatile boolean finish1 = false;
    private static volatile boolean finish2 = false;
    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10_000_000; i++) {
                try {
                    boolean cond = true;
                    while (cond) {
                        if (lock.tryLock()) {
                            counter++;
                            cond = false;
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }
            finish1 = true;
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10_000_000; i++) {
                try {
                    boolean cond = true;
                    while (cond) {
                        if (lock.tryLock()) {
                            counter++;
                            cond = false;
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }
            finish2 = true;
        }).start();

        while (!finish1 || !finish2) ;
        System.out.println(counter);
    }
}
