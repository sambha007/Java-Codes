package distt.pattern;
import java.util.*;
import java.lang.*;

public class triangle {
    public static void main(String args[])
    {
        int num;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number");
        num=obj.nextInt();
        for(int i=0;i<=num;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
