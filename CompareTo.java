package distt.String;
import java.util.*;

public class CompareTo {
    public static void main(String []args)
    {
        String str[]={"chiku","apple","banana","tomato","pineapple","mango"};
        String largest=str[0] ;
        for(int i=1;i<str.length;i++)
        {
            if(str[i].compareTo(largest)>0)
            {
              largest=str[i];
            }
        }
        System.out.println(largest);
    }
    
}
