class Area{
    private int h, w;

    Area(){
        h = w = 2;
    }
    Area(int h, int w){
        this.h = h;
        this.w = w;
    }

    Area(Area ob){
        h = ob.h;
        w = ob.w;
    }

    void show(){
        System.out.println("Area is: "+h*w);
    }
}
class Rectangle extends Area{

    Rectangle(){
        super();
    }

    Rectangle(int h, int w){
        super(h,w);
    }
    Rectangle(Area ob){
        super(ob);
    }
}
public class learnSuper {
    public static void main(String args[]) {
        Rectangle ob = new Rectangle();
        ob.show();
        Rectangle ob2 = new Rectangle(4, 2);
        ob2.show();
        Rectangle ob3 = new Rectangle(ob2);
        ob3.show();

    }
}
