// static variables, static method
class A{
    static int a = 10;
    static int b = 20;

    static void show(){
        A ob = new A();
        System.out.println("A: "+ a +" B: "+ b);
    }

    static{
        System.out.println("Hello");
    }
}
public class learnStatic {
    public static void main(String args[]) {
        A.show();
    }
}
