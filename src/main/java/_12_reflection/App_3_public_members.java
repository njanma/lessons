package _12_reflection;

import _12_reflection.init.ConcreteClass;
import com.sun.org.apache.xml.internal.utils.ObjectPool;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App_3_public_members {
    public static void main(String[] args) {
        Class<?>[] classes = new ConcreteClass(3).getClass().getClasses();
        System.out.println(Stream.of(classes).map(Object::toString).collect(Collectors.joining("\n")));
    }
}
