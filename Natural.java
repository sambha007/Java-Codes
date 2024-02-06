import java.util.Scanner;
import java.lang.*;

class Natural
{
   public static void main(String args[])
   {
      System.out.println("enter number to addition of natural number");
      Scanner obj =new Scanner(System.in);
      int a;
      a=obj.nextInt();
      int i,x=0;
      for(i=0;i<=a;i++)
      {
         x=x+i;
      }
      System.out.println("sum of given natural numbers "+x);
   }
}