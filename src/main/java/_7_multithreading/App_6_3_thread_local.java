package _7_multithreading;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class App_6_3_thread_local {
    public static void main(String[] args) throws InterruptedException {
        ThreadId threadId = new ThreadId();

        Runnable runnable = () -> System.err.println(threadId.getId());
        Runnable runnableSet = () -> {
            threadId.setId(new Random().nextInt());
            System.err.println(threadId.getId());
        };

        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();

        new Thread(runnableSet).start();
        Thread.sleep(1000);
        new Thread(runnable).start();
    }

    private static class ThreadId {
        private static final AtomicInteger id = new AtomicInteger();
        private static final ThreadLocal<Integer> thl = ThreadLocal.withInitial(id::incrementAndGet);

        Integer getId() {
            return thl.get();
        }

        void setId(Integer value) {
            thl.set(value);
        }
    }
}
