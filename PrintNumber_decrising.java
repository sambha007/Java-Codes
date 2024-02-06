package distt.Recursion;
import java.util.*;

public class PrintNumber_decrising {
    public static void printnum(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printnum(n-1);
    }
    public static void printinc(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        printinc(n-1);
        System.out.println(n);
    }
    public static void main(String args[])
    {
        int n=10;
        printnum(n);
        printinc(n);
    }
}
