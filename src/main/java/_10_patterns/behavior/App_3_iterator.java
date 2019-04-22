package _10_patterns.behavior;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * https://refactoring.guru/ru/design-patterns/iterator
 */
public class App_3_iterator {
    public static void main(String[] args) {
        Iterator<Object> iterator = new ArrayList<>().iterator();
    }
}
