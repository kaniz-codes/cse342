import java.util.*;
class Complex{
    int real, imag;

    Complex(){
        real = 8;
        imag = 3;
    }
    Complex(int r,int i){
        real=r;
        imag=i;
    }

    void Read(){
        Scanner SC = new Scanner(System.in);
        int real = SC.nextInt();
        int imag = SC.nextInt();

        this.real=real;
        this.imag=imag;
        System.out.println("Enter real and imaginary numbers: "+real+","+imag);
    }

    Complex add (Complex ob){
        Complex temp = new Complex(this.real+ob.real,this.imag+ob.imag);
        return temp;
    }

    void Display(){
        System.out.println("The complex number is: "+this.real+" + "+this.imag+ "i");
    }
}
public class task{
    public static void main (String args[]){
        Complex a = new Complex();
        Complex b = new Complex();
        Complex c;

        a.Read();
        b.Read();
        c = a.add(b);
        c.Display();
    }
}