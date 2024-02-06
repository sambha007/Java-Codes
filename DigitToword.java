package distt.Recursion;
import java.util.*;

public class DigitToword {
    public static String word[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printnumber(int n)
    {
        if(n==0)
        {
            return;
        }
        int last=n%10;
        printnumber(n/10);
        System.out.print(word[last]+" ");
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("entre number to want print");
        int n=obj.nextInt();
        printnumber(n);
    }
}
