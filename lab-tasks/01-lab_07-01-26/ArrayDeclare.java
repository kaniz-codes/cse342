import java.util.*;
public class ArrayDeclare {
    public static void main(String args[])
    {
        Scanner SC = new Scanner (System.in);
        int a[] = {1, 2, 3, 4, 5};
        int n = a.length;
        for(int i = 0; i < n; i++)
        {
            System.out.println("Value of array index " + i + " is " + a[i]);
        }

    }
}
