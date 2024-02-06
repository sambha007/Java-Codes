package distt.function;
import java.util.*;
import java.lang.*;

public class Primefunction2 {
    public static void prime(int a)
    {
        boolean p=true;
        if(a==2)
        {
            p=true;
        }
        else
        {
            for(int i=2;i<Math.sqrt(a);i++)
            {
                if(a%i==0)
                {
                    p=false;
                }
            }
        }
        if(p==true)
        {
            System.out.println("this is prime number");

        }
        else
        {
            System.out.println("this in not prime number");
        }
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number to check prime number");
        int a=obj.nextInt();
        prime(a);
    }
    
}
