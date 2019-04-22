package _8_java8;

import java.util.stream.Stream;

import static java.lang.Character.isDigit;

public class App_6_stream_filter {
    public static void main(String[] args) {
        Stream.of("a", "1abc", "abc1")
                .filter(value -> isDigit(value.charAt(0)))
                .filter(value -> isDigit(value.charAt(value.length() - 1)))
                .peek(System.out::println);

        boolean isFalse= Stream.of("", "2").allMatch(str -> str.length() > 0);
        boolean isTrue = Stream.of("", "2").anyMatch(str -> str.length() > 0);

    }
}
