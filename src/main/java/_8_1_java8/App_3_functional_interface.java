package _8_1_java8;

import java.util.Arrays;
import java.util.List;

/**
 * package java.util.function
 */
public class App_3_functional_interface {
    public static void main(String[] args) {
        MyPredicate<List<String>> isListEmpty = list -> list.size() < 1;
        if(isListEmpty.test(Arrays.asList("1","2"))){
            System.out.println("No way!");
        }
    }

    @FunctionalInterface
    interface MyPredicate<T> {
        boolean test(T arg);
    }
}
