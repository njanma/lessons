package _6_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class App_9_dirs {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/mydir");

        Files.createDirectory(path);
        Files.createFile(path);

        Files.exists(path);

        Path tempFile = Files.createTempFile(path, "today_", "tmp");
        Path tempDir = Files.createTempDirectory(path, "today_");

        Files.copy(path, Files.newOutputStream(tempDir));
        Files.move(tempFile, tempDir);
        Files.copy(tempFile, tempDir, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
        Files.delete(tempDir);
        boolean deleted = Files.deleteIfExists(tempFile);

        Files.list(path.getRoot());
        Stream<Path> innerPaths = Files.walk(path.getRoot());
    }
}
