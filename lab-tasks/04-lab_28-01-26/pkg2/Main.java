package pkg2;
import pkg1.*;
class BoxB extends BoxA{
    public BoxB(int h, int w, int d){
        super(h, w, d);
    }
}
public class Main {
    public static void main(String arg[]){
        BoxA ob1= new BoxA(5, 6,8);
        BoxB ob2= new BoxB(35, 7,8);
        ob1.Calculate();
        ob2.Calculate();
    }
}