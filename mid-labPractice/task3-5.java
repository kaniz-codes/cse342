class Employee{
    void calculateSalary(){

    }
}
class FullTimeEmployee extends Employee{
    double balance;

    FullTimeEmployee(double balance){
        this.balance = balance;
    }
    void calculateSalary(){
        System.out.println("Full Time salary is: "+ (balance*0.9));
    }
}
class PartTimeEmployee extends Employee{
    double balance;
    PartTimeEmployee(double balance){
        this.balance = balance;
    }
    void calculateSalary(){
        System.out.println("Part Time salary is: "+ (balance*0.6));
    }
}
public class task{
    public static void main (String args[]){
        Employee ob;
        FullTimeEmployee full =  new FullTimeEmployee(50000);
        PartTimeEmployee part = new PartTimeEmployee(500);

        ob = full;
        ob.calculateSalary();

        ob =  part;
        ob.calculateSalary();
    }
}