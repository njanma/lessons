package _12_reflection;

import _12_reflection.init.ConcreteClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class App_5_interface_etc {
    public static void main(String[] args) throws ClassNotFoundException {
        final Class<? extends ConcreteClass> concreteClazz = new ConcreteClass(12).getClass();

        //getting package name
        System.out.println(Class.forName("_12_reflection.init.BaseInterface").getPackage().getName());

        //getting class modifiers
        System.out.println(Modifier.toString(concreteClazz.getModifiers())); //prints "public"
        System.out.println(Modifier.toString(Class.forName("_12_reflection.init.BaseInterface").getModifiers()));

        //getting type parameters (generics)
        TypeVariable<?>[] typeParameters = Class.forName("java.util.HashMap").getTypeParameters();
        for (TypeVariable<?> t : typeParameters)
            System.out.print(t.getName() + ",");

        //getting implemented interfaces
        Type[] interfaces = Class.forName("java.util.HashMap").getGenericInterfaces();
        System.out.println(Arrays.toString(interfaces));
        System.out.println(Arrays.toString(Class.forName("java.util.HashMap").getInterfaces()));
    }
}
