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

public class bankaccount {
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