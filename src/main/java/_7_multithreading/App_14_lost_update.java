package _7_multithreading;

public class App_14_lost_update {
    private static volatile int counter = 0;
    private static volatile boolean finish1 = false;
    private static volatile boolean finish2 = false;

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10_000_000; i++) {
                counter++;
            }
            finish1 = true;
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10_000_000; i++) {
                counter++;
            }
            finish2 = true;
        }).start();

        while (!finish1 || !finish2) ;
        System.out.println(counter);
    }
}
