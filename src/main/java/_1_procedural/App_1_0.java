package _1_procedural;

public class App_1_0 {

    //complement
    // 0111 1111 == 127
    // 0000 0001 == 1
    // 0000 0000 == 0
    // 1111 1111 == -1
    // 1000 0001 == -127
    // 1000 0000 == -128

    // 1 byte = 8 bit

    boolean aBoolean   = true;     // 1 bit
    char    aChar      = '\u0000'; // 16 bit Unicode characters
    byte    aByte      = 0;        // 8 bit  -128 .. 127
    short   aShort     = 0;        // 16 bit -32,768 .. 32,767
    int     anInt      = 0;        // 32 bit -2,147,483,648 .. 2,147,483,647
    long    aLong      = 0L;       // 64 bit -9,223,372,036,854,775,808 .. 9,223,372,036,854,775,807
    float   floatType  = 0.0f;     // 32 bit 3.40282347 x 10^38, 1.40239846 x 10^-45
    double  doubleType = 0.0d;     // 64 bit 1.7976931348623157 x 10^308, 4.9406564584124654 x 10^-324

    public static void main(String[] args) {
        int b = 2;
        int d = 4, c = 4;

        //type cast
        short sh1 = 1, sh2 = 1;
        byte b1 = 1, b2 = 1;
        int sh3 = sh1 + sh2;
        int b3 = b1 + b2;
        double b4 = b3 / 2.0;

        //divide by zero
//        System.out.println(1 / 0);
//        double inf = 1.0 / 0;
//        double infMinus = -1.0 / 0;
//        double nan = 0.0 / 0;
//        System.out.println(nan == nan);
//        System.out.println(nan);
        System.out.println((c = c + b) == (c += b));
        System.out.println((++c) == (d = d + 1));

        //TODO: psvm on increment and decrement
        // +=, -=, *=, /=, %=, ++, --
    }
}
