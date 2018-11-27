package _4_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * BigO notation
 * java.util.Collection
 */
public class App_9_collection {
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();

        List<Integer>       arrayList  = new ArrayList<>();
        List<Integer>       linkedList = new LinkedList<>();


        Iterator<Integer>     iterator     = arrayList.iterator();
        ListIterator<Integer> listIterator = arrayList.listIterator();
    }
}
