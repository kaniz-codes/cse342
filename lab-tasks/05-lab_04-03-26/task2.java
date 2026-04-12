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