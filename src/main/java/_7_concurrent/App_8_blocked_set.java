package _7_concurrent;

import lombok.SneakyThrows;

public class App_8_blocked_set {


    public static void main(String[] args) {
        new Thread(() -> syncBlockInside(0)).start();
        new Thread(() -> syncBlockInside(1)).start();
        new Thread(() -> syncBlockInside(2)).start();
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

    synchronized void syncOnCurrentObject() {
        synchronized (this) {
            System.out.println("on current");
        }
    }

    void syncOnThisObj() {
        synchronized (this) {
            System.out.println("on this");
        }
    }
}
