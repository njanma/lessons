package _4_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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


        HashSet<String> alphabet = new HashSet<>(Arrays.asList("AAA", "BBB", "CCC", "AAA"));
        System.out.println(alphabet);
    }
}
