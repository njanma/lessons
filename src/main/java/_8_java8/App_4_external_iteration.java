package _8_java8;

import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * /resources/external_iter.png
 */
public class App_4_external_iteration {
    public static void main(String[] args) {
        List<Artist> allArtists = asList();
        countArtistsFromByForEach("London", allArtists);
        countArtistsFromByIterator("London", allArtists);
    }

    private static int countArtistsFromByForEach(String town, List<Artist> allArtists) {
        int count = 0;
        for (Artist artist : allArtists) {
            if (artist.isFrom(town)) {
                count++;
            }
        }
        return count;
    }

    private static int countArtistsFromByIterator(String town, List<Artist> allArtists) {
        int count = 0;
        Iterator<Artist> iterator = allArtists.iterator();
        while (iterator.hasNext()) {
            Artist artist = iterator.next();
            if (artist.isFrom(town)) {
                count++;
            }
        }
        return count;
    }

    interface Artist {
        boolean isFrom(String town);
    }
}
