package interfacesAndAbstractClasses;

public class Rectangle extends Parallelogram {
    // Длины сторон прямоугольника
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }
}

/*
public class Rectangle {
    // Длины сторон прямоугольника
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }
}
 */
