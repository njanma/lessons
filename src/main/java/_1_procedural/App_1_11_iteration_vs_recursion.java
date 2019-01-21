package _1_procedural;

import java.util.Arrays;

public class App_1_11_iteration_vs_recursion {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        invert(ints);
        System.out.println(Arrays.toString(ints));

        //recursion
//        System.out.println(factRecursion(3));
//        invertRecursively(ints, 0);
//        System.out.println(fibonacciRec(8));
    }

    //iteration
    public static void invert(int[] ints) {
        for (int k = 0; k < ints.length / 2; k++) {
            int tmp = ints[k];
            ints[k] = ints[ints.length - k - 1];
            ints[ints.length - k - 1] = tmp;
        }
    }

    //recursion
    public static void invertRecursively(int[] ints, int k) {
        System.out.println(k);
        if (k < ints.length / 2) {
            int tmp = ints[k];
            ints[k] = ints[ints.length - k - 1];
            ints[ints.length - k - 1] = tmp;
            invertRecursively(ints, ++k);
            System.out.println(k * 10);
        }
    }

    static int fibonacciRec(final int number) {
        System.out.println("input arg: " + number);
        if (number == 1 || number == 2) {
            return 1;
        } else {
            int result = fibonacciRec(number - 1) + fibonacciRec(number - 2);
            System.out.println("out from frame with result: " + result);
            return result;
        }
    }

    static int factRecursion(final int number) {
        System.out.println("input arg: " + number);
        if (number <= 1) {
            System.out.println("Found base case!");
            System.out.println("return 1");
            return 1;
        } else {
            int recursiveCallResult = factRecursion(number - 1);
            System.out.println("result from recursive call: " + recursiveCallResult + " * input: " + number);
            return number * recursiveCallResult;
        }
    }
}
