package _12_reflection;

import _12_reflection.init.ConcreteClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class App_7_method {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        final Class<? extends ConcreteClass> concreteClazz = new ConcreteClass(12).getClass();

        //getting public methods
        Method[] publicMethods = concreteClazz.getMethods();
        System.out.println(Arrays.toString(publicMethods));

        //invoking method
        Method method = concreteClazz.getMethod("method8", int.class);
        method.setAccessible(true);//for private methods
        final ConcreteClass concreteClass = new ConcreteClass(12);
        method.invoke(concreteClass, 12);//throws InvocationTargetException, IllegalAccessException
    }
}
