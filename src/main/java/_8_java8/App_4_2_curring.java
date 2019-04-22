package _8_java8;

import lombok.Value;
import lombok.experimental.Accessors;

import java.util.function.Function;

public class App_4_2_curring {

    public static void main(String[] args) {


        Function<String, Function<String, Album>> createAlbum =
                musicianName ->
                        albumTitle ->
                                new Album(new Musician(musicianName), albumTitle);

        System.out.println(createAlbum);
        Function<String, Album> cobainAlbumFunc = createAlbum.apply("Cobain");
        System.out.println(cobainAlbumFunc);

        Album nevermind = cobainAlbumFunc.apply("Nevermind");
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
