package distt.pattern;
import java.util.*;
import java.lang.*;

public class ABC {
    public static void main(String args[])
    {
        char ch='A';
        Scanner obj =new Scanner(System.in);
        System.out.println("enetr number");
        int n=obj.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
    
}
