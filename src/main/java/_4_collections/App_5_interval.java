package _4_collections;

import java.util.List;

import static _4_collections.iterator.Utils.interval;
import static java.util.Arrays.asList;

public class App_5_interval {
    public static void main(String[] args) {
        List<String> cities = asList("NY", "Cairo", "Osaka", "Mexico City", "Beijing", "Mumbai", "Delhi", "Tokyo");

        for (Integer i : interval(3, 6))
            System.out.println(cities.get(i));
    }
}
