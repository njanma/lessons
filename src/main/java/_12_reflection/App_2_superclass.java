package _12_reflection;

public class App_2_superclass {
    public static void main(String[] args) throws ClassNotFoundException{
        Class<?> superClass = Class.forName("_12_reflection.init.ConcreteClass").getSuperclass();
        System.out.println(superClass); // prints "class _12_reflection.init.BaseClass"
        System.out.println(Object.class.getSuperclass()); // prints "null"
        System.out.println(String[][].class.getSuperclass());// prints "class java.lang.Object"
    }
}
