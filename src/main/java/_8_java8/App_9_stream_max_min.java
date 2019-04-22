package _8_java8;

import lombok.Value;
import lombok.experimental.Accessors;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

public class App_9_stream_max_min {
    public static void main(String[] args) {
        final List<User> users = asList(User.of("Jim", 12), User.of("Nick", 15), User.of("Adam", 25));
        final Optional<User> yangest = users.stream()
                .min(Comparator.comparing(user -> user.age()));
        System.out.println(yangest.get());
    }

    @Value(staticConstructor = "of")
    @Accessors(fluent = true)
    static class User {
        final String name;
        final int age;
    }
}
