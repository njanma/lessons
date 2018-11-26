package _4_collections.iterator.interval;

import java.util.Iterator;

public class IntervalIterator implements Iterator<Integer> {
    private int current;
    private final int to;

    public IntervalIterator(int from, int to) {
        this.current = from;
        this.to = to;
    }

    @Override
    public boolean hasNext() {
        return current < to;
    }

    @Override
    public Integer next() {
        return current++;
    }
}