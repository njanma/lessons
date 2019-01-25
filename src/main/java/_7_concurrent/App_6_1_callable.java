package _7_concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * volatile
 */
public class App_6_1_callable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "hello";
            }
        };
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<String> futureResult = executor.submit(callable);

        //non-blocking
        while(!futureResult.isDone()){
            Thread.yield();
        }

        //blocking
        String result = futureResult.get();

        System.out.println(result);

        executor.shutdown();
    }
}
