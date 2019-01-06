package _1_procedural;

import java.util.Arrays;

public class App_1_11_iteration_vs_recursion {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        invert(ints);
        System.out.println(Arrays.toString(ints));
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
        if (k < ints.length / 2) {
            int tmp = ints[k];
            ints[k] = ints[ints.length - k - 1];
            ints[ints.length - k - 1] = tmp;
            invertRecursively(ints, ++k);
        }
    }

}
