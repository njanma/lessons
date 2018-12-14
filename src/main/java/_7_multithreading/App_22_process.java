package _7_multithreading;

import _6_io.Utils;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class App_22_process {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/C", "dir")
                .directory(Paths.get("C:\\").toFile())
                .redirectOutput(Paths.get(Utils.RESOURCES, "out.txt").toFile());

        Process process = processBuilder.start(); //throws IOException
        process.waitFor(3, TimeUnit.SECONDS); //throws InterruptedException
    }
}
