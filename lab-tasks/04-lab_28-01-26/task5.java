class Employee{

    void calculateSalary(){

    }
}
class FullTimeEmployee extends Employee {
    double Balance;

    FullTimeEmployee(double Balance) {
        this.Balance = Balance;
    }

    void calculateSalary() {
        System.out.println("Full Time Salary:" + (Balance * 0.9));
    }
}
class PartTimeEmployee extends Employee{
    double b;
    PartTimeEmployee(double b){
        this.b = b;
    }

    void calculateSalary(){
        System.out.println("Part Time Salary:"+ (b * 0.6));
    }
}
public class task5 {
    public static void main (String args[]){
        Employee ob1;
        FullTimeEmployee ob2 = new FullTimeEmployee(200000);
        ob1 = ob2;
        ob1.calculateSalary();

        PartTimeEmployee ob3 = new PartTimeEmployee(40000);
        ob1 = ob3;
        ob1.calculateSalary();

    }
}
