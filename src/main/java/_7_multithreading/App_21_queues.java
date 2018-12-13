package _7_multithreading;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

/**
 * https://en.wikipedia.org/wiki/Skip_list
 */
public class App_21_queues {
    public static void main(String[] args) {
        //non-blocking queues
        Queue<Object> linkedQueue = new ConcurrentLinkedQueue<>();
        Deque<Object> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();

        //blocking queues
        BlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(100);
        BlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<>(); //default size Integer.MAX_VALUE
        BlockingQueue<MyDelayed> delayQueue = new DelayQueue<>();
        BlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();

        //blocking deques
        BlockingDeque<Object> linkedBlockingDeque = new LinkedBlockingDeque<>(); //default size Integer.MAX_VALUE

        //transfer queues
        BlockingQueue<Object> singleBuffer = new SynchronousQueue<>();
        TransferQueue<Object> transferQueue = new LinkedTransferQueue<>();
    }


    private static class MyDelayed implements Delayed {

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.toMillis(1000);
        }

        @Override
        public int compareTo(Delayed o) {
            return (int) (o.getDelay(TimeUnit.MILLISECONDS) - this.getDelay(TimeUnit.MILLISECONDS));
        }
    }
}
