package distt.function;
import java.util.Scanner;

public class Factorial {
    public static long fact(int n)
    {
        long ans=1;
        for(int i=1;i<=n;i++)
        {
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("enetr number to calculate it's factorial");
        int n=obj.nextInt();
      //  long f=fact(n);
        System.out.println(" factorial is "+fact(n));
    }
    
}
