abstract class Shape{
    int h, w, r;
    Shape(int r){
        this.r = r;
    }
    Shape(int h, int w){
        this.h=h;
        this.w=w;
    }
    abstract void perimeter();
    abstract void area();
}
class Circle extends Shape{
    Circle(int r){
        super(r);
    }
    void perimeter(){
        System.out.println("Perimeter of Circle: "+ (2*3.1416*r));
    }
    void area(){
        System.out.println("Area of Circle: "+ (3.1416*r*r));
    }
}
class Rectangle extends Shape{
    Rectangle(int h, int w){
        super(h, w);
    }
    void perimeter(){
        System.out.println("Perimeter of Rectangle: "+ (2*(h+w)));
    }
    void area(){
        System.out.println("Area of Rectangle: "+ (h*w));
    }
}
public class task{
    public static void main(String args[]){
        Shape ob;
        Circle circle = new Circle(5);
        ob = circle;
        ob.perimeter();
        ob.area();

        Rectangle rectangle = new Rectangle(10,20);
        ob = rectangle;
        ob.perimeter();
        ob.area();
    }
}