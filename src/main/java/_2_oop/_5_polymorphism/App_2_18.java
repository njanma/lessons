package _2_oop._5_polymorphism;

public class App_2_18 {
    public static void main(String[] args) {
        Figure2[] figure2s = {new Figure2.Circle2(1), new Figure2.Rectangle2(1, 2)};
        for (Figure2 figure : figure2s) {
            System.out.println(FigureUtils3.perimeter(figure));

        }
    }
}


abstract class Figure2 {
    private Figure2() {
    }

    public static final class Circle2 extends Figure2 {
        private final double radius;

        public Circle2(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }
    }

    public static final class Rectangle2 extends Figure2 {
        private final double width;
        private final double height;

        public Rectangle2(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }
    }
}

class FigureUtils3 {

    public static double perimeter(Figure2.Rectangle2 rect) {
        return 2 * (rect.getHeight() + rect.getWidth());
    }

    public static double perimeter(Figure2.Circle2 circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    public static double perimeter(Figure2 figure) {
        if (figure instanceof Figure2.Rectangle2) {
            return perimeter((Figure2.Rectangle2)figure);
        } else if (figure instanceof Figure2.Circle2) {
            return perimeter((Figure2.Circle2)figure);
        } else {
            throw new Error("Bad type!");
        }
    }
}