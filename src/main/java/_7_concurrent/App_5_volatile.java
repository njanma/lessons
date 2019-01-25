package _7_concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * volatile
 */
public class App_5_volatile {

    private static boolean done = false;

    public static void main(String[] args) {

        Runnable hello = () -> {
            for (int i = 1; i <= 1000; i++)
                System.err.println("Hello " + i);
            done = true;
        };
        Runnable goodbye = () -> {
            int i = 1;
            System.err.println("pre while");
            while (!done) i++;
            System.err.println("Goodbye " + i);
        };

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(hello);
        executor.execute(goodbye);
    }
}
//if  (!done)  while  (true)  i++; ...
