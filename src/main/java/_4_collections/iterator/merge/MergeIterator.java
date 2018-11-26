package _4_collections.iterator.merge;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MergeIterator implements Iterator<Integer> {

    private final Iterator<Integer> fst;
    private final Iterator<Integer> snd;

    public MergeIterator(Iterator<Integer> fst,
                         Iterator<Integer> snd) {
        this.fst = fst;
        this.snd = snd;
    }

    @Override
    public boolean hasNext() {
        return fst.hasNext() || snd.hasNext();
    }

    @Override
    public Integer next() {
        if (fst.hasNext()) {
            return fst.next();
        } else if (snd.hasNext()) {
            return snd.next();
        }

        throw new NoSuchElementException();
    }
}
