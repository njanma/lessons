package _4_collections.iterator.instream.task;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class ISToIteratorAdapter implements Iterator<Integer> {

    private final InputStream in;

    public ISToIteratorAdapter(InputStream inputStream) {
        this.in = inputStream;
    }

    @Override
    public boolean hasNext() {
        try {

            return in.available() != 0;

        } catch (IOException e) {
            return sneakyThrow(e);
        }
    }

    @Override
    public Integer next() {
        try {
            return in.read();
        } catch (IOException e) {
            return sneakyThrow(e);
        }
    }


    private <T extends Throwable, R> R sneakyThrow(Throwable t) throws T {
        throw (T) t;
    }
}
