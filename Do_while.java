package question;
import java.util.Scanner;
import java.lang.*;


public class Do_while {
    public static void main(String args[])
    {
        int num;
        Scanner obj=new Scanner(System.in);
        do
        {
            System.out.println("enetr number");
            num=obj.nextInt();
            if(num%10==0)
            {
                System.out.println("this multipe of 10 "+num);
                break;
            }
            System.out.println("yor number is "+num);

        }while(true);
    }
    
}
