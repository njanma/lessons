package lesson_1.buble_sort;

import java.util.Arrays;

public class App_01 {

    //element ascent
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print(Arrays.toString(arr) + " -> ");

        for (int k = 0; k < arr.length - 1; k++) {

            int tmp = arr[k];

            arr[k] = arr[k + 1];

            arr[k + 1] = tmp;

        }

        System.out.println(Arrays.toString(arr));

    }
}
