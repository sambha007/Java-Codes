package question;
import java.lang.*;
import java.util.Scanner;

public class Prime {
    public static void main(String args[])
    {
        int num;
        int count=0;
        Scanner obj =new Scanner(System.in);
        System.out.println("enter number ");
        num=obj.nextInt();
        for(int i=2;i<num;i++)
        {
           if(num%i==0)
           {
            count++;
           }
        }
        if(count==0)
        {
            System.out.println("this is prime");
        }
        else
        {
            System.out.println("this is not prime");
        }
    }
    
}
