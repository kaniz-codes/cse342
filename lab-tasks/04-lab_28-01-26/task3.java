class Payment{
    void pay(){
        System.out.println("Pay amount");
    }
}
class CreditCardPayment extends Payment{
    void pay(){
        System.out.println("Pay Credit Card.");
    }
}

class PayPalPayment extends Payment{
    void pay(){
        System.out.println("Pay Paypal.");
    }
}
public class task3 {
    public static void main (String args[]){
        Payment ob1;
        CreditCardPayment ob2 = new CreditCardPayment();
        ob1 = ob2;
        ob1.pay();

        PayPalPayment ob3 = new PayPalPayment();
        ob1 = ob3;
        ob1.pay();
    }
}
