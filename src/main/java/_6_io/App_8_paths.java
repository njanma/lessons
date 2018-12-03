package _6_io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class App_8_paths {
    public static void main(String[] args) {
        Path absolute = Paths.get("/", "home", "cay");
        Path relative = Paths.get("myapp", "conf", "user.properties");

        Path props = Paths.get("home", "cay", "myapp.properties");
        Path parent = props.getParent();  // Путь /home/сау
        Path file = props.getFileName();  // Последний элемент myapp.properties заданного пути
        Path root = props.getRoot();  // Начальный отрезок пути /  (или пустое значение null для относительного пути)
        Path first = props.getName(0);  // Первый элемент заданного пути
        Path dir = props.subpath(1, props.getNameCount());// Весь путь,  кроме первого элемента cay/myарр.properties

        for (Path component : absolute) {
        }
    }
}
