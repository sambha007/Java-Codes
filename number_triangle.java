package distt.pattern;
import java.util.*;
import java.lang.*;

public class number_triangle {
    public static void main(String args[])
    {
        int num;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number");
        num=obj.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
