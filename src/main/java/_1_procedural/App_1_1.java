package _1_procedural;

import java.util.Arrays;

public class App_1_1 {
    public static void main(String[] args) {
        System.out.println(new Object());
        System.out.println("x = " + new Object());

        char[] arrChars = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(arrChars);
//        System.out.println(Arrays.toString(arrChars));

        arrChars[1] = 'f';

        int[] emptyArray = new int[0];
        int[] filledArray = new int[]{1, 2, 3};
//        int[] arrIncorrect;
//        arrIncorrect = {1, 2, 3};
        //incorrect
        System.out.println(emptyArray == filledArray);
        System.out.println(emptyArray.equals(filledArray));
        //correct
        System.out.println(Arrays.equals(emptyArray, filledArray));

        int[] array1D = {1, 2, 3};
        int[][] array2D = {
                {1, 2},
                {3, 4},
                {5, 6},
        };
//        System.out.println(array1D);
//        System.out.println(Arrays.toString(array1D));
//        System.out.println(Arrays.toString(array2D));
//        System.out.println(Arrays.deepToString(array2D));

        //idioms
        //Arrays.class, Collections.class, Executors.class
    }
}
