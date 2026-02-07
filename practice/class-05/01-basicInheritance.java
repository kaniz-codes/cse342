class A{
    A(){
        System.out.println("A class");
    }
}
class B extends A{
    B(){
        System.out.println("B class");
    }
}
class C extends B{
    C(){
        System.out.println("C class");
    }
}
public class task1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
    }
}
