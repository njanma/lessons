package _7_concurrent;

import _6_io.Utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class App_22_process {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process process = linuxProcess().start(); //throws IOException
        process.waitFor(3, TimeUnit.SECONDS); //throws InterruptedException
    }

    private static ProcessBuilder windowsProcess() {
        return new ProcessBuilder("cmd.exe", "/C", "dir")
                .directory(Paths.get("C:\\").toFile())
                .redirectOutput(Paths.get(Utils.RESOURCES, "out.txt").toFile());
    }

    static ProcessBuilder linuxProcess() {
        new File(Paths.get("out.txt").toUri());
        return new ProcessBuilder("ls", "-l")
                .directory(Paths.get("/").toFile())
                .redirectOutput(Paths.get("out.txt").toFile());
    }
}
