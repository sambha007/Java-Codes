package question;
import java.lang.*;
import java.util.*;

public class whilee {
    public static void main(String ar[])
    {
        System.out.println("print numbers from 1 to 100 using while loop");
        int i=1;
        while(true)
        {
            System.out.print("\t"+i);
            i++;
            if(i==101)
            {
               System.out.println("\n you reached your final state...");
               break;
            }
        }
    }
    
}
