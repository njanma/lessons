package _8_patterns.behavior;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * https://refactoring.guru/ru/design-patterns/mediator
 */
public class App_4_mediator {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<?> exec_task = executorService.submit(() -> System.out.println("exec task"));
    }
}
