package _6_io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App_7_object_stream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(Utils.RESOURCES, "objects.txt")));
        out.writeObject(new User("Kostya"));
        out.writeObject(new User("Vadim"));


        ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get(Utils.RESOURCES, "objects.txt")));
        User kostya = (User) objectInputStream.readObject();
        User vadim = (User) objectInputStream.readObject();
        System.out.println(kostya);
        System.out.println(vadim);
    }

    static class User implements Serializable {

        String name;

        public User(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
