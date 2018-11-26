package _4_collections.iterator;

import _4_collections.iterator.interval.IntervalIterable;
import _4_collections.iterator.merge.MergeIterable;
import _4_collections.iterator.squares.SquaresIterable;

public class Utils {
    private Utils() {
    }

    public static Iterable<Integer> interval(int from, int to) {
        return new IntervalIterable(from, to);
    }

    public static Iterable<Integer> squares(int from, int to) {
        return new SquaresIterable(from, to);
    }

    public static Iterable<Integer> merge(Iterable<Integer> fst, Iterable<Integer> snd) {
        return new MergeIterable(fst, snd);
    }
}
