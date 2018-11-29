package _4_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

/**
 * TODO: устройство java.util.List
 */
public class App_10_list {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(6, 3, 4, 5, 1);
        ArrayList<Integer> arrayList = new ArrayList<>(ints);
        LinkedList<Integer> linkedList = new LinkedList<>(ints);

        sortRandomAccessCollections(arrayList);
//        sortRandomAccessCollections(linkedList);

        System.out.println(arrayList);
        System.out.println(linkedList);

        arrayList.add(1);
        arrayList.get(1);
        arrayList.set(0, 33);
        arrayList.remove(2);
        arrayList.contains(3);
        arrayList.size();

//        java.lang.UnsupportedOperationException
//        Arrays.asList(1,2,3,4,5).add(6);
    }

    private static <E extends Comparable<E>, T extends List<E> & RandomAccess> void sortRandomAccessCollections(T collection) {
        Collections.sort(collection);
    }
}
