abstract class Employee1{

    abstract void calculateSalary();
}
class FullTimeEmployee1 extends Employee1 {
    double Balance;

    FullTimeEmployee1(double Balance) {
        this.Balance = Balance;
    }

    void calculateSalary() {
        System.out.println("Full Time Salary:" + (Balance * 0.9));
    }
}
class PartTimeEmployee1 extends Employee1{
    double b;
    PartTimeEmployee1(double b){
        this.b = b;
    }

    void calculateSalary(){
        System.out.println("Part Time Salary:"+ (b * 0.6));
    }
}
public class t5 {
    public static void main (String args[]){
        Employee1 ob1;
        FullTimeEmployee1 ob2 = new FullTimeEmployee1(200000);
        ob1 = ob2;
        ob1.calculateSalary();

        PartTimeEmployee1 ob3 = new PartTimeEmployee1(40000);
        ob1 = ob3;
        ob1.calculateSalary();

    }
}
