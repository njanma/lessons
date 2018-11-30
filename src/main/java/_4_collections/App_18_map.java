package _4_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * TODO: методы у java.util.HashMap и java.util.TreeMap
 */
public class App_18_map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Vasia", 25);
        map.put("Vladimir", 37);
        map.put("Konstantin", 50);

        System.out.println(map);

        System.out.println(new TreeMap<>(map));
    }
}
