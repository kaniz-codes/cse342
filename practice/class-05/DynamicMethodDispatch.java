class Flower{
    String name;

    Flower(String name){
        this.name = name;
    }

    void show(){
        System.out.println("Name: " + name);
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
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Flower f1 = new Flower("rose");
        Rose r1 = new Rose("China rose");
        Flower f2 = r1;

        f1.show();
        f2.show();
    }
}
