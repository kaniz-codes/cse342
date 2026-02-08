interface i1{
    void show();
    void show1();
}
interface i2{
    void show2();
}
class A implements i1, i2{
    public void show(){
        System.out.println("A");
    }
    public void show1(){
        System.out.println("A1");
    }
    public void show2(){
        System.out.println("A2");
    }
}
public interface MultipleInterface {
    public static void main (String args[]){
        A ob = new A();
        i1 r1 = ob;
        r1.show();
        r1.show1();

        i2 r2 = ob;
        r2.show2();
    }
}
