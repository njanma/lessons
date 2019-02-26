package _7_concurrent;

import lombok.SneakyThrows;

public class App_8_blocked_set {

    private final Object mutex = new Object();

    public static void main(String[] args) {
//        new Thread(() -> syncBlockInside(0)).start();
//        new Thread(() -> syncBlockInside(1)).start();
//        new Thread(() -> syncBlockInside(2)).start();


        new Thread(() -> new App_8_blocked_set().syncOnCurrentObject(1)).start();
        new Thread(() -> new App_8_blocked_set().syncOnCurrentObject(2)).start();
        new Thread(() -> new App_8_blocked_set().syncOnCurrentObject(3)).start();
    }


    static synchronized void block(int idx) {
        System.out.println(idx);
    }

    @SneakyThrows
    static void syncBlockInside(int idx) {
        System.err.println("before block for " + idx);
        synchronized (App_8_blocked_set.class) {
            Thread.sleep(1000);
            System.err.println(idx);
        }
    }
    final Object monitor = new Object();

    synchronized void syncOnCurrentObject(int idx) {
        System.err.println("before block for " + idx);
        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.err.println(idx);
            System.err.println("on current");
        }
    }

    void syncOnMutexObj() {
        synchronized (mutex) {
            System.out.println("on this");
        }
    }
}
