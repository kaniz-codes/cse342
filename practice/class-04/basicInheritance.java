class A{
    int i, j;
    void show(){
        System.out.println("I: " + i + " J: " + j);
    }
}
class B extends A{
    int k;

    void set(int i, int j, int k){
        this.i = i;
        this.j = j;
        this.k = k;
    }

    void show1(){
        System.out.println(i*j*k);
    }
}
public class task7 {
    public static void main(String args[]) {
        B b = new B();
        b.set(1,2,3);
        b.show();
        b.show1();
    }
}
