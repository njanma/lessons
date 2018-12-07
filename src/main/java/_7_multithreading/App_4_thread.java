package _7_multithreading;

import java.time.LocalTime;

/**
 * TODO: java.lang.Thread methods
 */
public class App_4_thread {
    public static void main(String[] args) {
        MyRunnable a = new MyRunnable(100, 2000, "A");
        MyRunnable b = new MyRunnable(100, 4000, "B");

        a.run();
        b.run();
    }


    static class MyRunnable implements Runnable {
        final int count;
        final long sleep;
        final String letter;

        MyRunnable(int count, long sleep, String letter) {
            this.count = count;
            this.sleep = sleep;
            this.letter = letter;
        }

        @Override
        public void run() {
            for (int i = 0; i < count; i++) {
                try {
                    Thread.sleep(sleep);
                    System.out.println(letter + " " + LocalTime.now().getSecond());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
