package _2_oop._9_enum;

import java.util.Arrays;

public class App_1 {

    public static void main(String[] args) {

        Color color = Color.RED;

        switch (color) {
            case RED:
            case BLACK:
            case GREEN:
        }

        System.out.println(Arrays.toString(Color.values()));
    }
}

enum Color {
    RED("R"), BLACK("B"), GREEN("G");

    private final String letter;

    Color(String letter) {
        this.letter = letter;
    }
}