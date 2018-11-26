package _4_collections.iterator.squares;

import java.util.Iterator;

public class SquaresIterator implements Iterator<Integer> {

    private int current;
    private final int to;

    public SquaresIterator(int from, int to) {
        this.current = from;
        this.to = to;
    }

    @Override
    public boolean hasNext() {
        return Math.pow(current, 2) < to;
    }

    @Override
    public Integer next() {
        return (int) Math.pow(current++, 2);
    }
}
