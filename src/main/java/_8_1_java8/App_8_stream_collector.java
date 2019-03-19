package _8_1_java8;

import lombok.Value;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.toList;

public class App_8_stream_collector {

    public static void main(String[] args) {
        final List<User> users = asList(
                User.of("Jim", 15),
                User.of("Jim", 14),
                User.of("Jim", 12),
                User.of("Nick", 15),
                User.of("Adam", 25));

        //toList
        final List<String> listNames = users.stream()
                .map(User::name)
                .collect(toList());
        //toSet
        final Set<String> setNames = users.stream()
                .map(User::name)
                .collect(Collectors.toSet());
        //toMap
        final Map<String, Integer> userMap = users.stream()
                .collect(Collectors.toMap(user -> user.name(), user -> user.age(), Integer::max));

        //reduce
        String numbers = Stream.of(1, 2, 3, 5)
                .reduce("", (left, right) -> left + right, (l, r) -> l + r);
        //group|reduce
        Map<String, Optional<User>> collect = users.stream()
                .collect(groupingBy(User::name,
                        reducing((usr1, usr2) -> User.of(usr1.name, usr1.age + usr2.age))));
        //joining
        String joinNames = users.stream()
                .map(User::name)
                .collect(Collectors.joining(", ", "[", "]"));
    }

    @Value(staticConstructor = "of")
    @Accessors(fluent = true)
    static class User {
        final String name;
        final int age;
    }
}
