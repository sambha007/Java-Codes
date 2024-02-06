package distt.pattern;
import java.util.*;

public class Dimond
{
    public static void dimo(int a)
    {
        for(int i=0;i<=a;i++)
        {
            for(int j=a;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=2*(i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=a;i>=0;i--)
        {
            for(int j=a;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=2*(i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number to print dimond size");
        int a=obj.nextInt();
        dimo(a);
        
    }
}
