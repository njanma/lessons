package _8_1_java8;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App_14_infinity_stream {
    public static void main(String[] args) {
        Stream.iterate(0, i -> i++);

        AtomicInteger integer = new AtomicInteger();
        Stream.generate(() -> integer.getAndIncrement())
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
