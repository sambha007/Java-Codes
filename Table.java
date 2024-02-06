package question;
import java.util.Scanner;
import java.lang.*;

public class Table {
    public static void main(String args[])
    {
        int num;
        Scanner obj=new Scanner(System.in);
        System.out.println("enetr number");
        num=obj.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.print(i*j+" ");
            }
            System.out.println(" ");
        }

    }
}
