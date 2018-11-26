package _4_collections.iterator.instream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class IteratorToISAdapter extends InputStream {
    private final Iterator<Integer> iterator;

    public IteratorToISAdapter(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    @Override
    public int read() throws IOException {
        return iterator.hasNext() ? iterator.next() : -1;
    }
}
