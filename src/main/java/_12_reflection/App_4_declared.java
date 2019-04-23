package _12_reflection;

import _12_reflection.init.ConcreteClass;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App_4_declared {
    public static void main(String[] args) throws ClassNotFoundException {
        //getting all of the classes, interfaces, and enums that are explicitly declared in ConcreteClass
        final Class<? extends ConcreteClass> concreteClazz = new ConcreteClass(3).getClass();
        Class<?>[] explicitClasses = concreteClazz.getDeclaredClasses();
        System.out.println(Stream.of(explicitClasses).map(Object::toString).collect(Collectors.joining("\n")));

        //getting declaring class
        Class<?> innerClass = Class.forName("_12_reflection.init.ConcreteClass$ConcreteClassDefaultClass");
        //prints _12_reflection.init.ConcreteClass
        System.out.println(innerClass.getDeclaringClass().getCanonicalName());
        System.out.println(innerClass.getEnclosingClass().getCanonicalName());
    }
}
