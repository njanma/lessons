package _10_patterns.behavior;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * https://refactoring.guru/ru/design-patterns/memento
 */
public class App_5_memento {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get("")));
        objectOutputStream.writeObject(new MySerializable());
    }

    private static class MySerializable implements Serializable {
    }
}
