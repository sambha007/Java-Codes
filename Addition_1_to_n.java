package question;
import java.util.*;
import java.lang.*;

public class Addition_1_to_n {
    public static void main(String args[])
    {
        int a;
        Scanner obj=new Scanner(System.in);
        System.out.println("enetr number to n we can get addition");
        a=obj.nextInt();
        int i=1;
        long add=0;
        while(i<=a)
        {
            add=add+i;
            i++;
        }
        System.out.println("addition is "+add);
        
    }
    
}
