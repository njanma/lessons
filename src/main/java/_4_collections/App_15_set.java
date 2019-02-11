package _4_collections;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

/**
 * устройство java.util.Set
 */
public class App_15_set {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Ivan"));
        System.out.println(names.add("Vladimir"));
        System.out.println(names.add("Ivan"));

        names.remove("Vladimir");
        names.contains("Alex");
        names.size();
//        names.get("Ivan");


        Set<String> alphabet = new HashSet<>(asList("AAA", "BBB", "CCC", "AAA"));
        System.out.println(alphabet);
    }
}
