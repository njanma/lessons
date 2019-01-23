package _1_procedural._hw.answer.hw3;

import java.util.Arrays;

/**
 * Написать программу, принимающую массив целых чисел, в котором м.б. повторения,
 * и возвращающую новый массив без повторяющихся числел, и печатающую результат.
 * В результирующем массиве не должно быть дубликатов.
 */
public class Arrays_2 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 1, 1, 3, 3, 5, 6, 5, 7};
        System.out.println("before: " + Arrays.toString(myArray));
        System.out.println("after: " + Arrays.toString(removeDuplicate(myArray)));
    }

    static int[] removeDuplicate(final int[] myArray) {
        final int[] idxToRemove = new int[myArray.length];
        int countToRemove = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] == myArray[i]) {
                    //set idx to remove
                    idxToRemove[j] = 1;
                    countToRemove++;
                    break;
                }
            }
        }
        //create new array without duplicates
        final int[] newArray = new int[myArray.length - countToRemove];
        int counter = 0;
        for (int i = 0; i < idxToRemove.length; i++) {
            if (idxToRemove[i] == 0) {
                newArray[counter++] = myArray[i];
            }
        }
        return newArray;
    }
}
