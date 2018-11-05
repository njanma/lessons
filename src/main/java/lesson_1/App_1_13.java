package lesson_1;

public class App_1_13 {
    public static void main(String[] args) {
        //abs
        int abs1 = Math.abs(10);  // abs1 = 10
        int abs2 = Math.abs(-20); // abs2 = 20

        double ceil  = Math.ceil(7.343);  // ceil = 8.0
        double floor = Math.floor(7.343); // floor = 7.0

        //floorDiv
        double result3 = Math.floorDiv(-100,9); // result3: -12.0
        double result4 = -100 / 9;              // result4: -11.0

        int min = Math.min(10, 20); // min = 10
        int max = Math.max(10, 20); // max = 20

        double roundedDown = Math.round(23.445); // 23.0
        double roundedUp   = Math.round(23.545); // 24.0

        //random
        double random      = Math.random();        // 0 || 1
        double randomMulti = Math.random() * 100D; // 0..100, example: 28.249090784808708

        double exp1 = Math.exp(1); // exp1 = 2.718281828459045

        double log_10    = Math.log(10);    // log_10 = 2.302585092994046
        double log10_100 = Math.log10(100); // log10_100 = 2.0

        double pow2  = Math.pow(2, 2); // pow2 = 4.0
        double sqrt4 = Math.sqrt(4);   // sqrt4 = 2.0

        double pi = Math.PI; // the mathematical definition of PI

        double sin  = Math.sin(Math.PI);
        double cos  = Math.cos(Math.PI);
        double tan  = Math.tan(Math.PI);
        double asin = Math.asin(1.0);
        double acos = Math.acos(1.0);
        double atan = Math.atan(1.0);

        double degrees = Math.toDegrees(Math.PI);
        double radians = Math.toRadians(180);
    }
}