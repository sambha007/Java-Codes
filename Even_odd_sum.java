package question;
import java.util.*;
import java.lang.*;

public class Even_odd_sum {
    public static void main(String []ar)
    {
      Scanner obj =new Scanner(System.in);
      int a;
      int even=0;
      int odd=0;
      int ch;
      do
      {
        System.out.println("enetr number to add");
        a=obj.nextInt();
        if(a%2==0)
        {
            even=even+a;
        }
        else
        {
            odd=odd+a;
        }
        System.out.println("you want add more number if yes=1/no=0");
        ch=obj.nextInt();

      }while(ch==1);
      System.out.println("addition of even numbers "+even);
      System.out.println("addition of odd numbers "+odd);
    }
    
}
