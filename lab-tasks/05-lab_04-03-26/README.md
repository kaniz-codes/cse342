# Lab 05: Exception Handling

View/Download Lab Task - [Lab Task 05 PDF](https://github.com/kaniz-codes/cse342/blob/main/lab-tasks/05-lab_04-03-26/05-lab-task.pdf)

## Problem 1
![Image](images\task1.png)

### Solution:

```java
class Student{
    String name;
    int completedCredit;

    Student(){
        name= null;
        completedCredit = 0;
    }

    Student(String name, int completedCredit){
        this.name = name;
        this.completedCredit = completedCredit;
    }

    void checkName(){
        try{
            System.out.println("Name: "+ name + " Length: " + name.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("Student profile not found. Skipping this student. "+ e);
        }
    }

    void calculate(){
        try{
            System.out.println("GPA: "+ (int)(18/completedCredit));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error "+ e);
        }
    }
}
public class task1 {
    public static void main(String args[]){
        Student ob = new Student("Kaniz", 6);
        Student ob1 = new Student("Fatema", 0);
        Student ob2 = new Student();

        System.out.println("Processing student 1:");
        ob.checkName();
        ob.calculate();

        System.out.println("Processing student 2:");
        ob1.checkName();
        ob1.calculate();

        System.out.println("Processing student 3:");
        ob2.checkName();
        ob2.calculate();

    }
}
```

## Problem 2
![Image](images\task2.png)

```java
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Current balance: " + balance);
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal amount exceeds current balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Current balance: " + balance);
    }
}

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(0);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        try {
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount1 = sc.nextDouble();
            account.withdraw(withdrawAmount1);

            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount2 = sc.nextDouble();
            account.withdraw(withdrawAmount2);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}
```