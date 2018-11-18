package _3_generics;

import java.util.Arrays;

public class App_2 {
    public static void main(String[] args) {
        String[] names = {"Peter", "Alex", "Emma", "Olivia"};

        Util.elementSwap(names, 1, 2);
        System.out.println(Arrays.toString(names));
    }
}

class Util {
    public static <T> void elementSwap(T[] arr, int fst, int snd) {
        T tmp = arr[fst];

        arr[fst] = arr[snd];
        arr[snd] = tmp;
    }
}
