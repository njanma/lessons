package _7_multithreading;

public class App_9_wait_set {

    private static final Object monitor = new Object();
    private static volatile boolean in = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            synchronized (monitor) {
                in = true;
                try {
                    System.err.println("before wait");
                    monitor.wait();
                    System.err.println("after wait");
                } catch (InterruptedException e) {
                }
            }
        }).start();
        System.err.println("A");
        while (!in) ;//spin lock
        System.err.println("B");
        synchronized (monitor) {
            System.err.println("C");
            monitor.notify();
//            Thread.sleep(5000);
            System.err.println("D");
        }
//        Thread.sleep(1000);
        System.err.println("E");
    }
}
