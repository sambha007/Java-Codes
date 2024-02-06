import java.util.*;
import java.lang.*;

public class Palindram
{
    public static void pali(int a)
    {
        int b=a;
        int sum=0;
        while(0<a)
        {
           int ls=a%10;
           sum=ls+(sum*10);
           a=a/10;
        }
        System.out.println("number is "+sum);
        if(sum==b)
        {
            System.out.println("this is palindram number ");
        }
    }
    public static void main(String args[])
    {
        System.out.println("enetr number to check palindarm ");
        Scanner obj =new Scanner(System.in);
        int num=obj.nextInt();
        pali(num);
    }
}
