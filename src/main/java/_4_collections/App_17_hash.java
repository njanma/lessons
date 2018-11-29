package _4_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * устройство java.util.Set
 */
public class App_17_hash {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("AAA", "BBB", "CCC", "AAA", "DDD");

        Set<String> hashSet16 = new HashSet<>(16, 1);
        hashSet16.addAll(strings);

        Set<String> hashSet64 = new HashSet<>(64, 1);
        hashSet64.addAll(strings);

        System.out.println(hashSet16);
        System.out.println(hashSet64);
    }
}
