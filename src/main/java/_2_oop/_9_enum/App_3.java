package _2_oop._9_enum;

public class App_3 {
}

enum Modifier {
    PUBLIC, PRIVATE, PROTECTED, STATIC, FINAL, ABSTRACT;
    private static int maskBit = 1;
    private int mask;

    Modifier() {
//        mask = maskBit;  // ОШИБКА: статическая переменная в конструкторе недоступна!
//        maskBit *= 2;
    }
}


enum Modifier2 {
    PUBLIC, PRIVATE, PROTECTED, STATIC, FINAL, ABSTRACT;
    private int mask;

    static {
        int maskBit = 1;
        for (Modifier2 m : Modifier2.values()) {
            m.mask = maskBit;
            maskBit *= 2;
        }
    }
}