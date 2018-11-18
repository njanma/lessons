package _2_oop._9_enum;

public class App_2 {

    public static void main(String[] args) {
        for (Color2 color : Color2.values()) {
            System.out.println("Color " + color + " has char value: " + color.toCharValue());
        }
    }
}

enum Color2 {
    RED {
        @Override
        char toCharValue() {
            return 'R';
        }
    },
    BLACK {
        @Override
        char toCharValue() {
            return 'B';
        }
    }, GREEN {
        @Override
        char toCharValue() {
            return 'G';
        }
    };

    abstract char toCharValue();
}