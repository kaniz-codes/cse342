import java.util.*;
class Person {
    String firstName, lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    String jobTitle;
    int empID;

    Employee(String firstName, String lastName, String jobTitle, int empID) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
        this.empID = empID;
    }

    public int getEmployeeId() {
        return empID;
    }

    public String getEmployeeDetails() {
        return "Employee Last Name: " + getLastName() +
                ", Job Title: " + jobTitle;
    }
}

public class task4 {
    public static void main(String[] args) {
        Employee emp = new Employee("Kaniz", "Fatema", "HR", 154);

        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println(emp.getEmployeeDetails());
    }
}
