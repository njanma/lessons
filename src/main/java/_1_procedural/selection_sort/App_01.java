package _1_procedural.selection_sort;

import java.util.Arrays;

public class App_01 {
    public static void main(String[] args) {
        int[] arr = {11, 10, 20, 3, 4, 5, 600, 700, 8, 9};

        System.out.print(Arrays.toString(arr) + " -> ");

        for (int i = 0; i < arr.length - 1; i++) {

            int min_idx = i;

            for (int index = i + 1; index < arr.length; index++) {

                if (arr[min_idx] > arr[index]) {
                    min_idx = index;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
