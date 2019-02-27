package _8_1_java8;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class App_8_stream_flatMap {
    public static void main(String[] args) {
        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(toList());

        System.out.println(together);
    }
}
