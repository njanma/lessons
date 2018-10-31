package lesson_1.buble_sort;

import java.util.Arrays;

public class App_03 {
    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 3, 4, 5, 600, 700, 8, 9};

        System.out.print(Arrays.toString(arr) + " -> ");

        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {

            for (int index = 0; index < barrier; index++) {

                if (arr[index] > arr[index + 1]) {

                    App_01.swap(arr, index, index + 1);
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
