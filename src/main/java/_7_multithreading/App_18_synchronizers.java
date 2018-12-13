package _7_multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Phaser;
import java.util.concurrent.Semaphore;

/**
 * https://habr.com/post/277669/
 */
public class App_18_synchronizers {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3, true);
        CountDownLatch countDownLatch = new CountDownLatch(3);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> System.out.println("complete!"));
        Exchanger<Object> exchanger = new Exchanger<>();
        Phaser phaser = new Phaser(3);
    }
}
