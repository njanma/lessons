package _2_oop._6_polymorphism;

import java.util.Arrays;

/**
 * https://en.wikipedia.org/wiki/Parametric_polymorphism
 */
public class App_2_20 {

    public static void main(String[] args) {
        Figure4[] figures = {new CircleFigure4(1), new RectangleFigure4(2, 1)};
        System.out.println(Arrays.toString(FigureUtilsParam.perimeters(figures)));
    }
}

interface Figure4 {
    double perimeter();
}

class CircleFigure4 implements Figure4 {
    private final double radius;

    public CircleFigure4(double radius) {
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

class RectangleFigure4 implements Figure4 {
    private final double width;
    private final double height;

    public RectangleFigure4(double width, double height) {
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

class FigureUtilsParam {
    public static <T extends Figure4> double[] perimeters(T[] figures) {
        final double[] perimeters = new double[figures.length];
        for (int i = 0; i < figures.length; i++) {
            perimeters[i] = figures[i].perimeter();
        }
        return perimeters;
    }
}