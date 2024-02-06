package question;
import java.util.Scanner;
import java.lang.*;


public class Continue_Ex {
    public static void main(String args[])
    {
        int num;
        Scanner obj=new Scanner(System.in);
        System.out.println("enetr number ");
        num=obj.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(i%10==0)
            {
                System.out.println("this is multiple by 10 "+i);
                continue;
            }
            System.out.println(i);
        }
    }
}
