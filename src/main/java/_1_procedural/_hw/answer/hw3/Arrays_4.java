package _1_procedural._hw.answer.hw3;


import java.util.Arrays;


/**
 * Написать функцию linearize, которая принимает в качестве параметра
 * двумерный массив и возвращает одномерный массив со всеми элементами двумерного.
*/
public class Arrays_4 {
    public static void main(String[] args) {
        int[][] myArray = {{1, 3, 4}, {5, 7, 9}};
        for (int[] i : myArray) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println(Arrays.toString(splitArray(myArray)));
    }

    public static int[] splitArray(int[][] myArray) {
        return Arrays_3.mergeArrays(myArray[0], myArray[1]);
    }


}
