package _5_exceptions;

public class App_6 {

    public static void main(String[] args) {
        System.out.println(area(10, 10));
//        System.out.println(area(-10, 10));
    }

    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return width * height;
    }
}
