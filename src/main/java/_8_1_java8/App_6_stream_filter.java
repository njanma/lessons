package _8_1_java8;

import java.util.List;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.stream.Collectors.toList;

public class App_6_stream_filter {
    public static void main(String[] args) {
        List<String> beginningWithNumbers = Stream.of("a", "1abc", "abc1")
                .filter(value -> isDigit(value.charAt(0)))
                .collect(toList());

        System.out.println(beginningWithNumbers);
    }
}
