package distt.pattern;
import java.util.*;
import java.lang.*;

public class SolidRombas {
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
                for(int j=0;j<n;j++)
                {
                 System.out.print("*");
                }
                System.out.println();
    
            }
    }
    
}
