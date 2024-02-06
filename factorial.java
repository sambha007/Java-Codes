package question;
import java.lang.*;
import java.util.*;
public class factorial {
    public static void main(String args[])
    {
        int num;
        int fact=1;
        Scanner obj =new Scanner(System.in);
        System.out.println("enetr number");
        num=obj.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;

        }
        System.out.println("factorial is "+fact);
    }
    
}
