abstract class Area{
    double d1, d2;

    Area(double d1, double d2){
        this.d1 = d1;
        this.d2 = d2;
    }
    abstract void calculateArea();
}
class Rectangle extends Area{
    Rectangle(double d1, double d2){
        super(d1, d2);
    }
    void calculateArea(){
        System.out.println("Area of rectangle is: " + d1*d2);
    }
}
class Triangle extends Area{
    Triangle(double d1, double d2){
        super(d1, d2);
    }
    void calculateArea(){
        System.out.println("Area of triangle is: " + (0.5*d1*d2));
    }
}
public class AbstractClassArea {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.6, 2.5);
        Triangle tr1 = new Triangle(15.2, 12.5);
        Area ob1;
        ob1 = r1;
        ob1.calculateArea();
        ob1 = tr1;
        ob1.calculateArea();

    }
}
