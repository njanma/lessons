package lesson_1;

public class App_1_12 {

    public static void main(String[] args) {
        System.out.println(invert("Hello"));
    }

    //immutable invert
    public static String invert(String args) {
        char[] chars = args.toCharArray();
        for (int k = 0; k < chars.length / 2; k++) {
            char tmp = chars[k];
            chars[k] = chars[chars.length - k - 1];
            chars[chars.length - k - 1] = tmp;
        }
        return new String(chars);
    }
}
