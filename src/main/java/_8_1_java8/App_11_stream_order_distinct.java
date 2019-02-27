package _8_1_java8;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class App_11_stream_order_distinct {
    public static void main(String[] args) {
        final Optional<Integer> min = asList(30, 3, 1, 49, 44)
                .stream()
                .sorted()
                .findFirst();
        final List<Integer> disctinted = asList(1, 30, 3, 1, 49, 30)
                .stream()
                .distinct()
                .collect(toList());


        System.out.println(min.get());
        System.out.println(disctinted);

        Stream.iterate(0, i -> i++).sorted().collect(toList());
    }
}
