package distt.function;
import java.util.Scanner;

public class Addition {
    
    public static void sub(int x,int y)
    {
        int z=x-y;
        System.out.println("subtraction is "+z);
    }
    static public double div(double x,double y)
    {
       double z=x/y;
       return z;
    }

    public static int mul(int x,int y)
    {
        int z=x*y;
        return z;
    }
    public static void add()
    {
      int a;
      int b;
      System.out.println("this is add fuction enetr numbers");
      Scanner obj=new Scanner(System.in);
      a=obj.nextInt();
      b=obj.nextInt();
      int c=a+b;
      System.out.println("addtion is "+c);
    }
    public static void main(String args[])
    {
       System.out.println(" perform all arithematic operations");
       add();
       System.out.println("perform multiplication of two numbers");
       Scanner obj1 =new Scanner(System.in);
       int x=obj1.nextInt();
       int y=obj1.nextInt();
       int z=mul(x,y);
       System.out.println("multiplication is "+z);
       System.out.println("perform division  ..................");
       double p=div(x,y);
       System.out.println("division is "+p);
       System.out.println("subrtraction is");
       sub(x,y);
    }
    
}
