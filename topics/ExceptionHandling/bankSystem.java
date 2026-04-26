/*In a banking system, users perform transactions such as withdrawals.
Errors may occur if the account number does not exist or the withdrawal amount exceeds the available balance.
Write a Java program that uses both built-in and user-defined exceptions to handle these cases.
Use throw, throws, try, catch and show exception propagation by calling a method that throws an exception and handling it in the main method.
Write proper messages for each exception and continue processing remaining users even after an error occurs.
*/

class exp1 extends Exception {
    exp1(String s) {
        super(s);
    }
}

class BankAccount {
    int balance = 0;

    BankAccount(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Current balance: " + balance);
    }

    void withdraw(int amount) throws exp1 {
        if (amount > balance) {
            throw new exp1("Not enough money.");
        } else {
            balance -= amount;
            System.out.println("Current balance: " + balance);
        }
    }
}

public class bankSystem {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(0);

        bank.deposit(1050);

        try {
            bank.withdraw(1200);
        } catch (exp1 e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}