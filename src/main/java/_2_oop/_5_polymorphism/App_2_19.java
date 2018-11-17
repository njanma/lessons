package _2_oop._5_polymorphism;

/**
 * Полиморфизм подтипов.
 */
public class App_2_19 {
    public static void main(String[] args) {
        Figure3[] figures = {new CircleFigure3(1), new RectangleFigure3(2, 1)};

        for (Figure3 figure : figures) {
            System.out.println("perimeter: " + figure.perimeter());
        }
    }
}

interface Figure3 {
    double perimeter();
}

class CircleFigure3 implements Figure3 {
    private final double radius;

    public CircleFigure3(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * getRadius();
    }
}

class RectangleFigure3 implements Figure3 {
    private final double width;
    private final double height;

    public RectangleFigure3(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double perimeter() {
        return 2 * (getHeight() + getWidth());
    }
}
