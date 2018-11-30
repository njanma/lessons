package _4_collections;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.BiConsumer;

/**
 * add vs offer
 * element vs peek
 * remove vs poll
 */
public class App_23_queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new ArrayDeque<>();

        Deque<Integer> dequeue = new LinkedList<>();
        Deque<Integer> dequeue2 = new ArrayDeque<>(10);

        Queue<Integer> priorityQueue = new PriorityQueue<>(11);

        actionOnQueue(queue, (counter, q) -> System.out.println(q.remove()), 15);
    }

    static <E> void actionOnQueue(Queue<E> queue, BiConsumer<Integer, Queue<E>> action, int count) {
        for (int i = 0; i < count; i++) {
            action.accept(i, queue);
        }
    }
}
