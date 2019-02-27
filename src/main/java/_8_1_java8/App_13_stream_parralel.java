package _8_1_java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.vavr.API.TODO;

public class App_13_stream_parralel {
    public static void main(String[] args) {
        final List<byte[]> files = Stream.of("url1", "url2", "url3")
                .parallel()
                .map(App_13_stream_parralel::downloadLargeFile)
                .collect(Collectors.toList());
    }

    static byte[] downloadLargeFile(String url) {
        return TODO();
    }
}
