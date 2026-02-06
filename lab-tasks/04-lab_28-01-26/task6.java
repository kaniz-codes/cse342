abstract class Marks{
    abstract void getPercentage();
}
class A extends Marks{
    double math, chem,phy;

    A(double math, double chem, double phy){
        this.math = math;

        this.chem = chem;
        this.phy = phy;
    }
   void getPercentage(){
        System.out.println("Percentage of class A: "+ (math+chem+phy)/3);
    }
}
class B extends Marks{
    double math, eng, chem,phy;

    B(double math, double eng, double chem, double phy){
        this.math = math;
        this.eng = eng;
        this.chem = chem;
        this.phy = phy;
    }
    void getPercentage(){
        System.out.println("Percentage of class A: "+ (math+eng+chem+phy)/4);
    }
}
public class task6 {
    public static void main(String args[]){
        Marks ob1;
        A ob2 = new A(99,53, 56);
        ob1 = ob2;
        ob1.getPercentage();

        B ob3 = new B(97,88, 98, 45);
        ob1 = ob3;
        ob1.getPercentage();

    }
}
