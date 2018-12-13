package _7_multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * https://habr.com/company/luxoft/blog/157273/
 */
public class App_19_executors {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Executors.newCachedThreadPool();
        Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() - 2);
        Executors.newWorkStealingPool();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4,
                0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());

        executor.execute(() -> System.out.println("Hi"));
        Future<String> future = executor.submit(() -> "Hi");

        executor.invokeAll(Arrays.asList(() -> "Hello", () -> "world"));//throws InterruptedException
        executor.invokeAny(Arrays.asList(() -> "Hello", () -> "world"));//throws ExecutionException

        executor.shutdown();
        List<Runnable> waitingTasks = executor.shutdownNow();
    }
}
