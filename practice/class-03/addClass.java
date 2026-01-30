// Method Overloading
class Sum{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}
public class addClass {
    public static void main(String args[]) {
        Sum obj = new Sum();
        System.out.println(obj.add(1, 2) + obj.add(2,3,4) + obj.add(3.1,5.6));
    }
}
