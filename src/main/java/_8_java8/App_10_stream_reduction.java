package _8_java8;

import lombok.Value;
import lombok.experimental.Accessors;

import java.util.List;

import static java.util.Arrays.asList;

public class App_10_stream_reduction {
    public static void main(String[] args) {
        final List<User> users = asList(User.of("Jim", 12), User.of("Nick", 15), User.of("Adam", 25));

        final int sumInts = asList(1, 2, 3).stream().reduce(0, (acc, next) -> acc + next);

        final int sumOfAges = users.stream().reduce(0, (acc, next) -> Integer.sum(acc, next.age()), Integer::sum);
    }

    @Value(staticConstructor = "of")
    @Accessors(fluent = true)
    static class User {
        final String name;
        final int age;
    }
}
