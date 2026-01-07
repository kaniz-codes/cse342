import java.util.*;

public class task2 {
    public static int factorial(int n)
    {
        int x= 1;
        for (int i = 2; i <= n; i++)
            x *= i;
        return x;

    }

    public static void main(String args[])
    {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();

        System.out.println("Factorial of " + n + " is " + factorial(n));

    }


}
