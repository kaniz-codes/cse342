abstract class Shape {

    double h, w;
    Shape(double h, double w) {
        this.h = h;
        this.w = w;
    }
    abstract void area();
}
class Rectangle extends Shape {
    Rectangle(double h, double w) {
        super(h, w);
    }
    @Override
    void area() {
        System.out.println("Area of rectangle: " + h * w);
    }
}
class Triangle extends Shape {
    Triangle(double h, double w) {
        super(h, w);
    }
    @Override
    void area() {
        System.out.println("Area of triangle: " + 0.5 * h * w);
    }
}
public class ShapeClass {
    public static void main(String[] args) {
        Shape ob1;
        Rectangle ob2 = new Rectangle(1.6, 2.5);
        ob1 = ob2;
        ob1.area();
        Triangle ob3 = new Triangle(1.6, 2.5);
        ob1 = ob3;
        ob1.area();
    }
}
