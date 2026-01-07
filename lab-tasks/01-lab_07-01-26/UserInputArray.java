import java.util.*;
public class UserInputArray {
    public static void main(String args[])
    {
        Scanner SC = new Scanner (System.in);
        System.out.println ("Enter array size" );
        int n = SC.nextInt();
        int a[] = new int[n];
        System.out.println ("Array size is " + n);

        for(int i = 0; i < n; i++)
        {
            a[i] = SC.nextInt();
        }
        System.out.println("Output: ");

        for(int i = 0; i < n; i++)
        {
            System.out.println("Value of array index " + i + " is " + a[i]);
        }

    }
}
