package _8_1_java8;

import lombok.Value;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class App_8_stream_collector {
    public static void main(String[] args) {
        final List<User> users = asList(User.of("Jim", 12), User.of("Nick", 15), User.of("Adam", 25));

        final List<String> names = users.stream().map(User::name).collect(Collectors.toList());
        String joinNames = users.stream().map(User::name).collect(Collectors.joining(", ", "[", "]"));
        final Map<String, Integer> userMap = users.stream().collect(Collectors.toMap(user -> user.name(), user -> user.age()));
    }

    @Value(staticConstructor = "of")
    @Accessors(fluent = true)
    static class User {
        final String name;
        final int age;
    }
}
