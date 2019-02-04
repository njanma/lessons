package _2_oop._10_by_ref_value;

public class App_0 {
    public static void main(String[] args) {
        int i = 15;
        byVal(i);

        int[] ints = {1, 2, 3};
        byRef(ints);
    }

    static void byVal(int intVal) {
        System.out.println(intVal);
        intVal = 10;
    }

    static void byRef(int[] arrayRef) {
        arrayRef[0] = 15;
        arrayRef = new int[]{60};
    }
}
