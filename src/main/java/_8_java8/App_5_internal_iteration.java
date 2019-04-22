package _8_java8;

import lombok.Value;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * /resources/internal_iter.png
 */
public class App_5_internal_iteration {
    public static void main(String[] args) {
        List<Artist> allArtists = asList(new Artist("London"), new Artist("Manchester"));
        long fromLondon = countArtistsFromByStream("London", allArtists);
        System.out.println(fromLondon);
    }

    private static long countArtistsFromByStream(String town, List<Artist> allArtists) {
        return allArtists.stream()
                .filter(artist -> artist.isFrom(town))
                .peek(art -> System.out.println(town))
                .count();
    }

    @Value
    static class Artist {
        private final String town;

        boolean isFrom(String that) {
            return town.equals(that);
        }
    }
}
