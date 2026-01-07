import java.util.*;
public class task1 {
    public static void max1(double a[])
    {
        double max = -100000;

        for(int i=0; i<a.length ; i++)
        {
            if(a[i]>max)
            {
                max= a[i];
            }
        }
        System.out.println("Maximum value " + max);
    }
    public static void main(String args[])
    {
        Scanner SC = new Scanner (System.in);
        System.out.println ("Enter array size" );
        int n = SC.nextInt();
        double a[] = new double[n];
        System.out.println ("Enter " + (n+1) +" numbers: ");

        for(int i = 0; i < n; i++)
        {
            a[i] = SC.nextInt();
        }
        System.out.println("Output: ");

        for(int i = 0; i < n; i++)
        {
            System.out.println("Value of array index " + i + " is " + a[i]);
        }

        max1(a);
    }
}
