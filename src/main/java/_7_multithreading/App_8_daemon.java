package _7_multithreading;

/**
 * Если поток демон то порождающие им потоки тоже демоны.
 */
public class App_8_daemon {
    public static void main(String[] args) {
        Runnable sleep1sec = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignore) {
            }
        };

        Thread thread = new Thread(() -> {
            System.out.println("Start working...");
            while (true) {
                System.out.println("sleep 5 sec.");

                try {
                    Thread.sleep(5000);

                    new Thread(sleep1sec).start();
                } catch (InterruptedException ignore) {
                }

                System.out.println("wake up");
            }
        });

//        thread.setDaemon(true);
        thread.start();
    }
}
