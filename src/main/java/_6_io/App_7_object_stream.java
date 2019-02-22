package _6_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App_7_object_stream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        OutputStream fos = Files.newOutputStream(Paths.get(Utils.RESOURCES, "objects.txt"));
        ObjectOutputStream out = new ObjectOutputStream(fos);
        User kostya1 = new User("Kostya");
        out.writeObject(kostya1);
        User vadim1 = new User("Vadim");
        vadim1.user = kostya1;
        out.writeObject(vadim1);


        InputStream fis = Files.newInputStream(Paths.get(Utils.RESOURCES, "objects.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);
        User kostya = (User) objectInputStream.readObject();
        User vadim = (User) objectInputStream.readObject();
        System.out.println(kostya);
        System.out.println(vadim);
    }

    static class User implements Serializable {

        String name;
        User user;

        public User(String name) {
            this.name = name;
        }


    }
}
