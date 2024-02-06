package distt.pattern;
import java.lang.*;
import java.util.*;

public class Butterfly {
    public static void butter(int a)
    {
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int x=1;x<=2*(a-i);x++)
            {
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=a;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int x=1;x<=2*(a-i);x++)
            {
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        System.out.println("enetr number of row you want in butter fly ");
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        butter(a);
    }
    
}
