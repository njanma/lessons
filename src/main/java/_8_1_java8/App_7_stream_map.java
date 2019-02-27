package _8_1_java8;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class App_7_stream_map {
    public static void main(String[] args) {
        List<String> collected = Stream.of("a", "Ь", "hello")
                .map(string -> string.toUpperCase())
                        .collect(toList());

        System.out.println(collected);
    }
}
