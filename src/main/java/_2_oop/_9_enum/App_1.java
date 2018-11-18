package _2_oop._9_enum;

public class App_1 {

    public static void main(String[] args) {

        Color color = Color.RED;

        switch (color) {
            case RED:
            case BLACK:
            case GREEN:
        }

    }
}

enum Color {
    RED, BLACK, GREEN
}