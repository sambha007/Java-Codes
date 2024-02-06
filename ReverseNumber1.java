package question;
import java.util.Scanner;
import jaav.lang.*;

public class ReverseNumber1 {
    public static void main(String args[])
    {
        int num;
        int ans;
        int rev=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enetr number to reverse");
        num=obj.nextInt();
        System.out.println("origanal number\t"+num);
        while(num>0)
        {
            ans=num%10;
            rev=(rev*10)+ans;
            num=num/10;

        }
        System.out.println("Revares number \t"+rev);
    }
    
}
