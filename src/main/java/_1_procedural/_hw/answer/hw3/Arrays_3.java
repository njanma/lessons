package _1_procedural._hw.answer.hw3;

import java.util.Arrays;

/**
 * Заданы 2 массива целых чисел произвольной длины.
 * Написать программу, создающую третий массив,
 * представляющий собой слияние 2-х заданных. Пример:
 * 1-й массив: {1, 2, 3, 4, 5}
 * 2-й массив: {5, 6, 7}
 * Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */
public class Arrays_3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 6, 7};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(mergeArrays(array1, array2)));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        final int LENGTARRAY1 = array1.length;
        final int LENGTARRAY2 = array2.length;
        final int LENGTARRAYMERGE = LENGTARRAY1 + LENGTARRAY2;
        int[] arrayMerge1_2 = new int[LENGTARRAYMERGE];
        int i = 0, j = 0;
        while (i < LENGTARRAYMERGE) {
            if (j < LENGTARRAY1) {
                arrayMerge1_2[i++] = array1[j];
            }
            if (j < LENGTARRAY2) {
                arrayMerge1_2[i++] = array2[j];
            }
            j++;
        }
        return arrayMerge1_2;
    }
}
