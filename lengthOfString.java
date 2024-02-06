package distt.Recursion;
import java.util.*;

public class lengthOfString {
    public static int countLength(String str)
    {
        if(str.length()==0)
        {
            return 0;
        }
        return countLength(str.substring(1))+1;
    }
    public static void main(String[] a)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enetr string");
        String str=obj.nextLine();
      System.out.println(countLength(str)); 
    }
    
}
