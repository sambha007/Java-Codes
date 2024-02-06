package distt.pattern;
import java.util.*;


public class Holl_Rectangle {
    public static void holl(int a,int b)
    {
      for(int i=1;i<=b;i++)
      {
        for(int j=1;j<=a;j++)
        {
            if(i==1 || i==b|| j==1 ||j==a)
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
        Scanner obj=new Scanner(System.in);
        System.out.println("enetr column ");
        int a=obj.nextInt();
        System.out.println("enter row ");
        int b=obj.nextInt();
        holl(a,b);

    }
    
}
