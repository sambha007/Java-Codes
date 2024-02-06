package distt.Recursion;

public class Factorial {
    public static int fact(int n,int test)
    {
        if(n==1)
        {
            return 1;
        }
        test=test*n;
        fact(n-1,test);
        return test;
    }
    public static int facto(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fnm1=facto(n-1);
        int fn=n*fnm1;
        return fn;
    }
    public static void main(String args[])
    {
        System.out.println(facto(5));
        int test=1;
        System.out.println(fact(5,test));
    }
    
}
