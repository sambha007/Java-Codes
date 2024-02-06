import java.util.Scanner;

class Squre
{
   public static void main(String args[])
   {
      System.out.println("enter number");
      Scanner obj=new Scanner(System.in);
      int a,sq,cu;
      a=obj.nextInt();
      sq=a*a;
      cu=a*a*a;
      System.out.println(" squre is "+sq+" cube is "+cu);

   }
}