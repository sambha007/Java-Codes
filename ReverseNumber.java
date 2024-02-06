package question;
import java.util.Scanner;
import java.lang.*;

public class ReverseNumber {
    public static  void main(String args[])
    {
        int num;
        int ans;
        
        Scanner obj =new Scanner(System.in);
        System.out.println("enetr number to Reverse");
        num=obj.nextInt();
        System.out.println("orignal number is \t"+num);
        System.out.print("reverse number is\t");
        while(num>0)
        {
            ans=num%10;
            System.out.print(ans);
            num=num/10;
        }



    }
    
}
