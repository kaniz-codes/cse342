class Shape {
    public double getPerimeter() {
        return 0;
    }

    public double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2* 3.1416* radius;
    }

    public double getArea() {
        return 3.1416* radius * radius;
    }
}

public class task5 {
    public static void main(String[] args) {
        Circle C1 = new Circle(5);
        System.out.println("Perimeter of Circle: " + C1.getPerimeter());
        System.out.println("Area of Circle: " + C1.getArea());
    }
}
