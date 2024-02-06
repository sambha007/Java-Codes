package question;
import java.util.*;

import javax.lang.model.util.ElementScanner14;0

import java.lang.*;
import java.lang.reflect.UndeclaredThrowableException;
public class positive_negative {
    public static void main(String ar[])
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("enter number any number");
        int a=obj.nextInt();
        if(a>0)
        {
            System.out.println("this is positvive number");
        }
        else if(a==0)
        {
            System.out.println("this is zero , we can not define ");

        }
        else 
        {
            System.out.println(" this is negative number ");
        }
    }
}
