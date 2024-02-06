package distt.pattern;
import java.util.*;
import java.lang.*;

public class HALFPYRAMIDwithNumbers {
    public static void main(String args[])
    {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number");
        n=obj.nextInt();
        for(int i=0;i<n;i++)
        {    int count=1;
            for(int j=n;j>i;j--)
            {
                System.out.print(count);
                count++;

            }
            System.out.println();
        }
    }
}
