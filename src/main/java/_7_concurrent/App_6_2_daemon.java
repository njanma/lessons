package _7_concurrent;

/**
 * Если поток демон то порождающие им потоки тоже демоны.
 */
public class App_6_2_daemon {
    public static void main(String[] args) throws InterruptedException {
        Runnable sleep1sec = () -> {
            try {
                System.out.println("sleep 1 sec.");
                Thread.sleep(1000);
            } catch (InterruptedException ignore) {
            }
        };

        Thread thread = new Thread(() -> {
            System.out.println("Start working...");
            while (true) {
                try {
                    System.out.println("sleep 5 sec.");
                    Thread.sleep(5000);

                    new Thread(sleep1sec).start();
                } catch (InterruptedException ignore) {
                }

                System.out.println("wake up");
            }
        });

//        thread.setDaemon(true);
        thread.start();


        Thread.sleep(1000);
        System.out.println("main exit");
    }
}
