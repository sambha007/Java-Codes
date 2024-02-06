import java.lang.*;
import java.util.*;

public class iff{
    public static void main(String args[])
    {
        System.out.println("enetr two values");
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        if(a>b)
        {
            System.out.println("a is bigger than b"+a);
        }
        else if(a==b)
        {
            System.out.println("both are equal "+a+b);
        }
        else
        {
            System.out.println("b is bigger than a"+b);
        }
    }
}
