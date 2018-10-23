package lesson_1;

import java.util.Arrays;

public class App_1_1 {
    public static void main(String[] args) {
        System.out.println(new Object());
        System.out.println("x = " + new Object());

        int[] arrInit1 = new int[0];
        arrInit1[0] = 1;
        int[] arrInit2 = {1, 2, 3};
        arrInit2[1] = 3;
        int[] arrInit3 = new int[]{1, 2, 3};
//        int[] arrIncorrect;
//        arrIncorrect = {1, 2, 3};
        //incorrect
        System.out.println(arrInit1 == arrInit2);
        System.out.println(arrInit1.equals(arrInit2));
        //correct
        System.out.println(Arrays.equals(arrInit1, arrInit2));

        int[] array1D = {1, 2, 3};
        int[][] array2D = {
                {1, 2},
                {3, 4},
                {5, 6},
        };
        System.out.println(array1D);
        System.out.println(Arrays.toString(array1D));
        System.out.println(Arrays.toString(array2D));
        System.out.println(Arrays.deepToString(array2D));

        //idioms
        //Arrays.class, Collections.class, Executors.class
    }
}
