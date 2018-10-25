package lesson_1.insertion_sort;

import java.util.Arrays;

public class App_01 {
    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 3, 4, 5, 600, 700, 8, 9};

        System.out.print(Arrays.toString(arr) + " -> ");

        for (int k = 1; k < arr.length; k++) {

            int newElement = arr[k];

            int location = k - 1;

            while (location >= 0 && arr[location] > newElement) {

                arr[location + 1] = arr[location];

                location--;

            }

            arr[location + 1] = newElement;

        }

        System.out.println(Arrays.toString(arr));
    }
}
