package _6_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class App_6_files {
    public static void main(String[] args) throws IOException {

        Files.newOutputStream(Paths.get(Utils.RESOURCES, "file6.txt"));
        Files.newInputStream(Paths.get(Utils.RESOURCES, "file6.txt"));

        Files.newBufferedWriter(Paths.get(Utils.RESOURCES, "file7.txt"));
        Files.newBufferedReader(Paths.get(Utils.RESOURCES, "file7.txt"));

        List<String> strings = Files.readAllLines(Paths.get(Utils.RESOURCES, "example.txt"));
        Stream<String> lazyStrings = Files.lines(Paths.get(Utils.RESOURCES, "example.txt"));
    }
}
