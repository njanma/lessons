package _2_oop._6_polymorphism;

import java.util.Arrays;
import java.util.List;

/**
 * https://en.wikipedia.org/wiki/Parametric_polymorphism
 */
public class App_2_20 {

    public static void main(String[] args) {
        Figure4<Float> circleFigure4 = new CircleFigure4(1);
        Figure4<Double> rectangleFigure4 = new RectangleFigure4(2, 1);
        List<Figure4<Float>> floatFig = Arrays.asList(circleFigure4);
        List<Figure4<Double>> doubleFig = Arrays.asList(rectangleFigure4);
//        FigureUtilsParam.perimeters(floatFig);
//        FigureUtilsParam.perimeters(doubleFig);
    }
}

interface Figure4<T extends Number> {
    T perimeter();
}

class CircleFigure4 implements Figure4<Float> {
    private final double radius;

    public CircleFigure4(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public Float perimeter() {
        return Float.valueOf(String.valueOf(2 * Math.PI * getRadius()));
    }
}

class RectangleFigure4 implements Figure4<Double> {
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
    public Double perimeter() {
        return 2 * (getHeight() + getWidth());
    }
}

class FigureUtilsParam {
    public static <T extends Figure4<Double>> double[] perimeters(List<T> figures) {
        final double[] perimeters = new double[figures.size()];
        for (int i = 0; i < figures.size(); i++) {
            perimeters[i] = figures.get(i).perimeter();
        }
        return perimeters;
    }
}