interface i1{
    int a = 20;
    String n = "Kaniz";
    void show();

    default void show1(){
        System.out.println("Default");
    }

    static void show2(){
        System.out.println("Static");
    }
}
class A implements i1{
    public void show(){
        System.out.println("Override");
    }
    public void show1(){
        i1.super.show1();
        System.out.println("Default called from A");
    }
}
public interface FirstInterface {
    public static void main (String[] args) {
        A ob = new A();
        ob.show();
        ob.show1();
        i1.show2();

        i1 ob2 = ob;
        ob2.show();

    }
}
