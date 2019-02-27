package _8_1_java8;

import lombok.Value;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class App_12_stream_downstream {
    public static void main(String[] args) {
        final Musician cobain = Musician.of("Cobain");
        final Musician reynolds = Musician.of("Reynolds");
        final List<Album> albums = asList(Album.of(cobain, "Nevermind"), Album.of(reynolds, "Evolve"), Album.of(cobain, "In Utero"));

        final Map<Musician, List<String>> musicianToAlbums = albums.stream()
                .collect(Collectors.groupingBy(Album::getMainMusician, Collectors.mapping(Album::getTitle, Collectors.toList())));
    }

    @Value(staticConstructor = "of")
    static class Album {
        final Musician mainMusician;
        final String title;
    }

    @Value(staticConstructor = "of")
    @Accessors(fluent = true)
    static class Musician {
        final String name;
    }
}
