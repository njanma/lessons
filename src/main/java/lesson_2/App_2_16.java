package lesson_2;

import static lesson_2.FigureUtils1.perimeter;

/**
 * Overloading.
 */
public class App_2_16 {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Rectangle rect = new Rectangle(2, 1);

        System.out.println("perimeter: " + perimeter(circle));
        System.out.println("perimeter: " + perimeter(rect));
    }
}

class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
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

class FigureUtils1 {

    public static double perimeter(Rectangle rect) {
        return 2 * (rect.getHeight() + rect.getWidth());
    }

    public static double perimeter(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }
}