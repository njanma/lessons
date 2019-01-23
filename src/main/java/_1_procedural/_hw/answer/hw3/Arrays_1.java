package _1_procedural._hw.answer.hw3;

import java.util.Arrays;

/**
 * Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится самым первым его элементом.
*/
public class Arrays_1 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        for (int i = 0; i < 3; i++) {
            shiftElementRigth(myArray);
            System.out.println(Arrays.toString(myArray));
        }
    }

    public static void shiftElementRigth(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int endElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = endElement;
    }
}
