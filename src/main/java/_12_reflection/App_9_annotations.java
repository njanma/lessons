package _12_reflection;

import _12_reflection.init.ConcreteClass;

import java.util.Arrays;

public class App_9_annotations {
    public static void main(String[] args) {
        final Class<? extends ConcreteClass> concreteClazz = new ConcreteClass(12).getClass();
        //getting annotations
        java.lang.annotation.Annotation[] annotations = concreteClazz.getAnnotations();
        System.out.println(Arrays.toString(annotations));
    }
}
