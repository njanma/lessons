package _1_procedural;

public class App_1_4_swap_III {
    public static void main(String[] args) {
        int a = 2; // 10
        int b = 3; // 11

        a = a ^ b; // a = 01, b = 11
        b = a ^ b; // a = 01, b = 10
        a = a ^ b; // a = 11, b = 10

        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        a   = 0011 1100
//        b   = 0000 1101
//      -----------------
//        a&b = 0000 1100
//        a|b = 0011 1101
//        a^b = 0011 0001
//        ~a  = 1100 0011
//        a<<2  = 1111 0000
//        a>>2  = 0000 1111
//        1011 1010 >> 4 = 1111 1011 compare to 1011 1010 >>> 4 = 0000 1011
    }
}
