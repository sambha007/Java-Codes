package distt.ExceptionHandling;
import java.util.*;

public class ExceptionDemo {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=obj.nextInt();
        System.out.println("enter the second number ");
        int b=obj.nextInt();
        int c=0;
        try
        {
             c=a/b;
            System.out.println("in try block");
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("in catch block "+aobj);
        }
        catch(ArrayIndexOutOfBoundsException aobj)
        {
            System.out.println("in catch block "+aobj);

        }
        catch(Exception ex)
        {
            System.out.println("catch block"+ex);

        }
        finally
        {
            System.out.println("in finally block");
        }
        System.out.println("ans is "+c);
    }
    
}
//exception handling can use try , catch , finally  
