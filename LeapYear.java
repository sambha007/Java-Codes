package question;
import java.lnag.*;
import java.util.*;

public class LeapYear {
    public static void  main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("enter year");
        int a=obj.nextInt();
        if(a%4==0)
        {
            System.out.println("this is leap year");
        }
        else if(a%100==0)
        {
            System.out.println("this is leap year 2");

        }
        else if(a%400==0)
        {
            System.out.println("this is leap year 3");
        }
        else
        {
           System.out.println("this is not leap year ");
        }
    }
    
}
