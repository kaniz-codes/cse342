class BankAccount {
    int accountNumber;
    double balance;

    void set(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount < 500) {
            balance = balance - amount;
        } else {
            System.out.println("Transaction Not valid");
        }
    }

    void displayInfo() {
        System.out.println("Account Number: " + accountNumber + " Balance: " + balance);
    }
}

class Customer {
    String name;
    int customerID;
    BankAccount account;

    void set(String name, int customerID, BankAccount account) {
        this.name = name;
        this.customerID = customerID;
        this.account = account;
    }

    void deposit(double amount) {
        account.deposit(amount);
    }

    void withdraw(double amount) {
        account.withdraw(amount);
    }

    void displayInfo() {
        System.out.println("Name: " + name + " Customer Id: " + customerID );
        account.displayInfo();
    }
}

public class task1 {
    public static void main(String args[]) {

        BankAccount B1 = new BankAccount();
        B1.set(12, 500.00);

        Customer C1 = new Customer();
        C1.set("Kaniz", 154, B1);

        C1.deposit(300);
        C1.withdraw(200);

        C1.displayInfo();
    }
}
