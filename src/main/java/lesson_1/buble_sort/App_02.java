package lesson_1.buble_sort;

import java.util.Arrays;

public class App_02 {

    //element ascent with condition
    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 3, 4, 5, 600, 700, 8, 9};

        System.out.print(Arrays.toString(arr) + " -> ");

        for (int k = 0; k < arr.length - 1; k++) {
            if (arr[k] > arr[k + 1]) {
                int tmp = arr[k];
                arr[k] = arr[k + 1];
                arr[k + 1] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

