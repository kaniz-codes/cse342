import java.util.*;
public class ArithmeticOperation {
    public static void sum(int a, int b)
    {
        System.out.println("Sum of a & b is " + (a+b));
    }
    public static void main(String args[])
    {
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        int b = SC.nextInt();

        System.out.println("a is: " + a);
        System.out.println("b is: " + b);
        sum(a,b);

    }
}

