package _2_oop._9_enum;

import java.util.Arrays;

public class App_1 {

    public static void main(String[] args) {

        Color color = getEnum();

        switch (color) {
            case RED:
                break;
            case BLACK:
                break;
            case GREEN:
                break;
        }

        System.out.println(Arrays.toString(Color.values()));
    }

    private static Color getEnum() {
        return 10 % 2 == 0 ? Color.GREEN : Color.BLACK;
    }
}

enum Color /*extends EnumClassExtension implements EnumInterfaceExtension*/ {
    RED("R"), BLACK("B"), GREEN("G");

    private final String letter;

    Color(String letter) {
        this.letter = letter;
    }
}

class EnumClassExtension {
}

interface EnumInterfaceExtension {
}