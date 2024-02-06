import java.util.Scanner;

public class Preincreament_postincrement {
    
    public static void main(String ar[])
    {
        int a=10;
        System.out.println("a="+a);
        int b=++a;//this value of a is first change then assin to b 
        System.out.println("a="+a);
        System.out.println("b="+b);
        int c =45;
        System.out.println("c="+c);
        int d =c++;
        System.out.println("c="+c);
        System.out.println("d="+d);
        int f =++d;
        System.out.println("f="+f);
        // now decrement 
        int x=10;
        System.out.println("x="+x);
        int y=x--;
        System.out.println("x="+x);
        System.out.println("y="+y);
        int z=--y;
        System.out.println("y="+y);
        System.out.println("z="+z);

    }
}
