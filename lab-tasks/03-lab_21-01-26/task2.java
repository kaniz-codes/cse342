import java.util.*;
class Complex{
    int real, imag;

    Complex(){
        real = 8;
        imag = 3;
    }
    void Read(){
        Scanner SC = new Scanner(System.in);
        int real = SC.nextInt();
        int imag = SC.nextInt();

        this.real = real;
        this.imag = imag;
        System.out.println("Enter real and imaginary numbers respectively: " + real +" "+imag);
    }

    Complex(int real, int imag){
        this.real = real;
        this.imag = imag;
    }

    Complex add (Complex ob){
        Complex temp = new Complex(this.real + ob.real, this.imag + ob.imag);
        return temp;
    }

    void Display()
    {
        System.out.println("Sum: " + real + "+" + imag + "i");
    }

}
public class task2 {
    public static void main (String args []){
        Complex a1 = new Complex();
        Complex a2 = new Complex();
        Complex a3;
        a1.Read();
        a2.Read();
        a3 = a1.add(a2);
        a3.Display();


    }
}
