package _4_collections;

import java.util.HashSet;
import java.util.Set;

/**
 * устройство java.util.Set
 */
public class App_15_set {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Ivan");
        names.add("Vladimir");

//        names.get("Ivan");
//        names.contains("Ivan");

        names.remove("Vladimir");
        names.contains("Alex");
        names.size();
    }
}
