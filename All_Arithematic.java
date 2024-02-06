import java.util.*;
import java.lang.*;
public class All_Arithematic {
    public static void main(String args[])
    {
        System.out.println("enetr two numbers");
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=a+b;
        int d=a*b;
        double e=a/b;
        int f=a-b;
        double g=a%b;
        System.out.println("all arithematic operations are "+a+" "+b+" "+c+" "+d+e+f+g);
    }
    
}
