package _4_collections.iterator.instream.task;

import java.io.InputStream;
import java.util.Iterator;

public class ISIterable implements Iterable<Integer> {

    private final InputStream in;

    public ISIterable(InputStream in) {
        this.in = in;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ISToIteratorAdapter(in);
    }
}
