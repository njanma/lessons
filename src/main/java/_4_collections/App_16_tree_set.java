package _4_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * устройство java.util.Set
 */
public class App_16_tree_set {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>(Arrays.asList("CCC", "AAA", "BBB", "AAA"));
        Set<String> hashSet = new HashSet<>(Arrays.asList("CCC", "AAA", "BBB", "AAA"));
        List<String> listOrdered = Arrays.asList("CCC", "AAA", "BBB", "AAA");

        System.out.println(treeSet);
        System.out.println(hashSet);
        System.out.println(listOrdered);

//        new TreeSet<>(Arrays.asList(new NonComparable()));
    }

    static class NonComparable {
    }
}
