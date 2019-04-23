package _12_reflection;

import _12_reflection.init.ConcreteClass;

import java.lang.reflect.Field;
import java.util.Arrays;

public class App_6_field {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        final Class<? extends ConcreteClass> concreteClazz = new ConcreteClass(12).getClass();

        //getting public fields
        Field[] publicFields = concreteClazz.getFields();
        System.out.println(Arrays.toString(publicFields));

        //get/set public field value
        Field field = concreteClazz.getField("publicInt"); //throws NoSuchFieldException
        ConcreteClass obj = new ConcreteClass(5);
        System.out.println(field.get(obj)); //throws IllegalAccessException
        field.setInt(obj, 10);
        System.out.println(field.get(obj));

        //get/set private field value
        Field privateField = concreteClazz.getDeclaredField("privateString");
        privateField.setAccessible(true); //turning off access check
        ConcreteClass objTest = new ConcreteClass(1);
        System.out.println(privateField.get(objTest));
        privateField.set(objTest, "private string updated");
        System.out.println(privateField.get(objTest));
    }
}
