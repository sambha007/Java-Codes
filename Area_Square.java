import java.lang.*;
import java.util.*;
class Area
{
   public static void main(String args[])
   {
    System.out.println("eneter the side of Square");
    Scanner obj =new Scanner(System.in);
    int side=obj.nextInt();
    
    int ans;
    ans=side*side;
    System.out.println("arae of Square is "+ans);
   }
}