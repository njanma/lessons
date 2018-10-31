package lesson_1.buble_sort;

import java.util.Arrays;

public class App_01 {

    //element ascent
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print(Arrays.toString(arr) + " -> ");

        for (int k = 0; k < arr.length - 1; k++) {

            swap(arr, k, k + 1);

        }

        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int fst, int snd) {
        int tmp = arr[fst];

        arr[fst] = arr[snd];

        arr[snd] = tmp;
    }
}
