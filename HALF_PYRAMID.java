package distt.pattern;
import java.lang.*;
import java.util.*;

public class HALF_PYRAMID {
    public static void main(String args[])
    {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enetr number");
        n=obj.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=n;j>=i+1;j--)
            {
               System.out.print(" ");
            }
            for(int x=0;x<i;x++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
