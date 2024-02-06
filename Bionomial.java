package distt.function;
import java.util.*;

public class Bionomial {
    public static long fact(int n)
    {
        long f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }

    public static void biono(int n,int r)
    {
        long fn=fact(n);
        long fr=fact(r);
        long fnr=fact(n-r);

        long ans=fn/(fr*fnr);
        System.out.println(" ans is "+ans);

      
    }

    public static void main(String args[])
    {
        int n;
        int r;
        System.out.println("enetr n and r for binomial ");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        r=obj.nextInt();
        biono(n,r);
    }
}
