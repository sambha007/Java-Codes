package distt.function;
import java.util.*;

public class PrimeFuction {
    public static void prime(int a)
    {
        boolean p=true;
        if(a==2)
        {
            p=true;
            System.out.println("this is prime number");
        }
        else
        {  
            for(int i=2;i<a;i++)
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
            System.out.println("this is not prime number");
        }

    }
    public static void main(String args[])
    {
        System.out.println("enetr number to check wheter it is prime or not");
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        System.out.println(" this is main fuction " );
        prime(a);
    }
    
}
