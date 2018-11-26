package _4_collections;

import static _4_collections.iterator.Utils.interval;
import static _4_collections.iterator.Utils.merge;
import static _4_collections.iterator.Utils.squares;

public class App_7 {
    public static void main(String[] args) {
        for (Integer i : merge(interval(1, 10), squares(10, 1050)))
            System.out.print(i + " ");

        System.out.println();

        for (Integer i : merge(merge(squares(10, 1050), squares(1, 10)), interval(0, 5)))
            System.out.print(i + " ");
    }
}
