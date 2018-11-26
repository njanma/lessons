package _4_collections.iterator.merge;

import java.util.Iterator;

public class MergeIterable implements Iterable<Integer> {
    private final Iterable<Integer> fst;
    private final Iterable<Integer> snd;

    public MergeIterable(Iterable<Integer> fst, Iterable<Integer> snd) {
        this.fst = fst;
        this.snd = snd;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MergeIterator(fst.iterator(), snd.iterator());
    }
}
