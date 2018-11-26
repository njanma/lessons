package _4_collections.iterator.interval;

import java.util.Iterator;

public class IntervalIterable implements Iterable<Integer> {

    private final int from;
    private final int to;

    public IntervalIterable(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntervalIterator(from, to);
    }
}
