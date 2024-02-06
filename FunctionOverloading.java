package distt.function;
// this program for understand the function overloading using parametr/arguments
import java.util.*;


public class FunctionOverloading {
    public static int sum(int a,int b)
    {
      return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void add1()
    {
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("enetr three number");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        int ans=sum(a,b,c);
        System.out.println("sum of two numbers "+ans);



    }

    public static void add()
    {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("enetr two number");
        a=obj.nextInt();
        b=obj.nextInt();
        int ans=sum(a,b);
        System.out.println("sum of two numbers "+ans);



    }
    public static void main(String args[])
    {
        System.out.println("enetr the number you want perform addtion 2 or three");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n==2)
        {
            add();
        }
        else
        {
            add1();
        }

    }
    
    
}
