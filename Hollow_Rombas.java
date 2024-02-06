package distt.pattern;
import java.util.*;
import java.lang.*;
public class Hollow_Rombas
{
    public static void rombas(int a)
    {   
            for(int x=1;x<=a;x++)
            {
                for(int j=a;j>x;j--)
                {
                System.out.print(" ");
                }
                for(int y=1;y<=a;y++)
                {
                    if(x==1||x==a||y==1||y==a)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            
        
    }
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("enter number you want hollow rombas");
        int a=obj.nextInt();
        rombas(a);
    }
}
