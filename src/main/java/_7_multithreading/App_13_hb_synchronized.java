package _7_multithreading;

public class App_13_hb_synchronized {
    private static boolean run = true;
    private static final Object monitor = new Object();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            synchronized (monitor) {
                run = false;
            }
        });
        thread.start();

        while (true) {
            synchronized (monitor) {
                System.err.println(run);
            }
        }
    }
}
