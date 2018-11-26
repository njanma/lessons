package _4_collections.iterator.squares;

import java.util.Iterator;

public class SquaresIterable implements Iterable<Integer> {

    private final int from;
    private final int to;

    public SquaresIterable(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SquaresIterator(from, to);
    }
}
