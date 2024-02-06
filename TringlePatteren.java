import java.lang.*;
import java.util.Scanner;

class StarPattern
{
   public static void main(String args[])
   {
      int i,j,a;
      Scanner obj =new Scanner(System.in);
      System.out.println("enetr pattern number");
      a=obj.nextInt();
      for(i=a;i>0;i--)
      {
        for(j=i;j>0;j--)
        {
          System.out.print("*");
        }
         System.out.println();
      }
      
   }
}