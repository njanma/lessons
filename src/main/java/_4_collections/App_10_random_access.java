package _4_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class App_10_random_access {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(6, 3, 4, 5, 1);
        ArrayList<Integer> arrayList = new ArrayList<>(ints);
        LinkedList<Integer> linkedList = new LinkedList<>(ints);

        sortRandomAccessCollections(arrayList);
//        sortRandomAccessCollections(linkedList);

        System.out.println(arrayList);
        System.out.println(linkedList);
    }

    private static <E extends Comparable<E>, T extends List<E> & RandomAccess> void sortRandomAccessCollections(T collection) {
        Collections.sort(collection);
    }
}
