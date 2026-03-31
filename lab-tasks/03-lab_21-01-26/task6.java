class BankAccount{
    double amount=100;

    void deposit(int x){
        this.amount += x;
    }
    
    void withdraw(double amount) {

    }
}
class SavingAccount extends BankAccount{

    void withdraw(double amount) {
        if (this.amount-amount < 100) {
            System.out.println("Transaction Not valid");

        } else {
            this.amount -= amount;
        }
    }

    void display()
    {
        System.out.println("Amount: " + amount);

    }
}

public class task6 {
    public static void main(String args[]){
        SavingAccount s1 = new SavingAccount();
        System.out.println("Innitial Ammount: ");
        s1.display();
        System.out.println("After Deposit: ");
        s1.deposit(2000);
        s1.display();
        System.out.println("After Withdraw: ");
        s1.withdraw(500);
        s1.display();

    }
}
