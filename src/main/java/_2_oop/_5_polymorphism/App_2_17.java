package _2_oop._5_polymorphism;

public class App_2_17 {
    public static void main(String[] args) {

        Figure[] figures = {new CircleFigure(1), new RectangleFigure(2, 1)};

        for (Figure figure : figures) {
            //выбор метода из множества перегруженных методов происходит в момент компиляции
//            System.out.println("perimeter: " + FigureUtils2.perimeter(figure));
        }
    }
}

interface Figure {
}

class CircleFigure implements Figure {
    private final double radius;

    public CircleFigure(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class RectangleFigure implements Figure {
    private final double width;
    private final double height;

    public RectangleFigure(double width, double height) {
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

class FigureUtils2 {

    public static double perimeter(RectangleFigure rect) {
        return 2 * (rect.getHeight() + rect.getWidth());
    }

    public static double perimeter(CircleFigure circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    // Ad hoc полиморфизм.
    // С появлением нового потомка нужно переписывать код.
   /*public static double perimeter(Figure figure) {
        if (figure instanceof RectangleFigure) {
            return perimeter((RectangleFigure) figure);
        } else if (figure instanceof CircleFigure) {
            return perimeter((CircleFigure) figure);
        } else {
            throw new Error("Bad type!");
        }
    }*/
}