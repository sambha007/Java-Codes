package distt.function;
import java.util.*;
import java.lang.*;

public class PrimeFuction3 {
    public static boolean prim(int a)
    {
        boolean p=true;
        for(int j=2;j<a;j++)
        {
           if(a%j==0)
           {
            p=false;
           }
        }
        return p;
    }

    public static void prime(int a)
    {
        System.out.println("prime numbers are ");
        for(int i=2;i<=a;i++)
        {
            boolean p=prim(i);
            if(p==true)
            {
                System.out.print(" "+i);
            }
        }
    }
    public static void main(String args[])
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("enetr the number to print prime number");
       int a=obj.nextInt();
       prime(a);
    }
    
}
