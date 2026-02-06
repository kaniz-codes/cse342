abstract class Shape{
    int h,w,r;
    Shape(int r){
        this.r = r;
    }
    Shape(int h, int w){
        this.h = h;
        this.w = w;
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

    Rectangle (int h, int w){
        super(h, w);
    }
    void perimeter(){
        System.out.println("Perimeter of Rectangle: "+ (2*(h+w)));
    }

    void area(){
        System.out.println("Area of Rectangle: "+ (h*w));
    }
}
public class task4 {
    public static void main (String args[]){
        Shape ob1;
        Circle ob2 = new Circle(6);
        ob1 = ob2;
        ob1.perimeter();
        ob1.area();

        Rectangle ob3 = new Rectangle(6, 7);
        ob1 = ob3;
        ob1.perimeter();
        ob1.area();


    }
}
