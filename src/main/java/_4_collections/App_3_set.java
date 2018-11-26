package _4_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App_3_set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("Mike", "Peter", "Bill"));

        for (String name : set) {
            System.out.println(name);
        }
    }
}
