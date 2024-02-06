package distt.Recursion;
import java.util.*;

public class SumOfnatrual {
    public static int calsum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int snm1=calsum(n-1);
        int sum=n+snm1;
        return sum;
    }
    public static void totalsum(int n,int i,int sum)
    {
        sum=sum+i;
        if(i<n)
        {
            totalsum(n, i+1, sum);
        }
        else
        {
            System.out.println(sum);
        }
    }
    public static void main(String args[])
    {
        System.out.println(calsum(10));
        totalsum(10, 1, 0);
    }
    
}
