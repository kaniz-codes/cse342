// Passing Object as Parameter
class Add{
    int a, b;
    Add(int a, int b){
        this.a = a;
        this.b = b;
    }
    boolean get(Add ob){
        if(ob.a == a && ob.b == b){
            return true;
        }
        else{
            return false;
        }
    }
}
public class passObject {
    public static void main(String[] args) {
        Add ob1 = new Add(1, 2);
        Add ob2 = new Add(3, 1000);
        System.out.println(ob1.get(ob2));
    }
}
