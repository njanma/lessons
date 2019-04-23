package _12_reflection;

import _12_reflection.init.ConcreteClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class App_8_constructor {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException {
        final Class<? extends ConcreteClass> concreteClazz = new ConcreteClass(12).getClass();

        //getting public constructors
        Constructor<?>[] publicConstructors = concreteClazz.getConstructors();
        System.out.println(Arrays.toString(publicConstructors));

        //getting constructor parameters
        Constructor<?> constructor = concreteClazz.getConstructor(int.class);//throws NoSuchMethodException
        System.out.println(Arrays.toString(constructor.getParameterTypes()));

        //instantiate constructor parameters
        Constructor<?> concreteClazzConstructor =concreteClazz.getConstructor(int.class);
        Object myObj = concreteClazzConstructor.newInstance(10);//throws IllegalAccessException, InstantiationException
        Method myObjMethod = myObj.getClass().getMethod("method1", null);
        myObjMethod.invoke(myObj, null);
    }
}
