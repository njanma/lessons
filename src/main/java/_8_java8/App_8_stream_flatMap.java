package _8_java8;

import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class App_8_stream_flatMap {
    public static void main(String[] args) {
        Stream.of(asList(1, ""), asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(toList());

    }
}
