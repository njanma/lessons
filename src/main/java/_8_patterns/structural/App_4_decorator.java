package _8_patterns.structural;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 * https://refactoring.guru/ru/design-patterns/decorator
 */
public class App_4_decorator {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new ByteArrayInputStream("bytes".getBytes()));
        Collections.unmodifiableList(new ArrayList<>());
        Collections.synchronizedList(new ArrayList<>());
        Collections.checkedList(new ArrayList<>(), Integer.class);
    }
}
