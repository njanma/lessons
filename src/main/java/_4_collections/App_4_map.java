package _4_collections;

import java.util.HashMap;
import java.util.Map;

public class App_4_map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Mike", 20);
        map.put("Peter", 25);
        map.put("Bill", 30);

        for (String name : map.keySet()) {
            System.out.println(name);
        }

        for (Integer age : map.values()) {
            System.out.println(age);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
