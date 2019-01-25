package _7_concurrent;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * java.util.concurrent.locks
 */
public class App_16_lock {

    public static void main(String[] args) throws InterruptedException {
        SingleBuffer<String> stringBuffer = new SingleBuffer<>();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    System.err.println("before get");
                    System.err.println(stringBuffer.get());
                    stringBuffer.put("new string" + new Random().nextInt(100));
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }).start();
        }

        Thread.sleep(5000);

        stringBuffer.put("myString");
    }

    static class SingleBuffer<E> {
        private final Lock lock = new ReentrantLock(true);
        private final Condition notEmpty = lock.newCondition();
        private final Condition notFull = lock.newCondition();
        private E element;

        public void put(E newElement) throws InterruptedException {
            lock.lock();
            try {
                while (this.element != null) {
                    notFull.await();
                }
                this.element = newElement;
                notEmpty.signal();
            } finally {
                lock.unlock();
            }
        }

        public E get() throws InterruptedException {
            lock.lock();
            try {
                while (this.element == null) {
                    notEmpty.await();
                }
                E result = this.element;
                this.element = null;
                notFull.signal();
                return result;
            } finally {
                lock.unlock();
            }
        }
    }
}
