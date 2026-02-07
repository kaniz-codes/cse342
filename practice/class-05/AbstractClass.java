abstract class Flower{
    String name;

    Flower(String name){
        this.name = name;
    }

    abstract void show();

    void show1(){
        System.out.println("Only for show");
    }
}
class Rose extends Flower{
    Rose(String name){
        super(name);
    }
    void show(){
        System.out.println("Name: " + name);
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Rose r1 = new Rose("China rose");
        Flower f1;
        f1 = r1;
        f1.show();
        f1.show1();
    }
}
