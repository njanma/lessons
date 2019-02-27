package _8_1_java8;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * /resources/internal_iter.png
 */
public class App_5_internal_iteration {
    public static void main(String[] args) {
        List<Artist> allArtists = asList();
        countArtistsFromByStream("London", allArtists);
    }

    private static long countArtistsFromByStream(String town, List<Artist> allArtists) {
        return allArtists.stream()
                .filter(artist -> artist.isFrom(town))
                .count();
    }

    interface Artist {
        boolean isFrom(String town);
    }
}
