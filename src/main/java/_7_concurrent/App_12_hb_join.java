package _7_concurrent;

public class App_12_hb_join {
    static boolean run = true;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> run = false);
        thread.start();

        thread.join();
        while (run) {// false
            System.out.println("No way!");
        }
    }
}
