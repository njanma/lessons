package _2_oop._10_by_ref_value;

public class App_2 {
    public static void main(String[] args) {

        int x = 0;
        int[] arr = {20};

        x = f(x, g(x, arr));
        System.out.println(x + " " + arr[0]);
    }

    private static int f(int x, int[] arr) {
        x += 30;
        arr[0] = 40;
        return 42;
    }

    private static int[] g(int x, int[] arr) {
        x = 50;
        arr = new int[]{60};
        return arr;
    }
}
