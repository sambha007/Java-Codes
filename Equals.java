package distt.String;
import java.util.*;

public class Equals {
    public static void main(String args[])
    {
        String str="sambha";
        String str1="sambha";
        String str2=new String("sambha");
        if(str==str1)
        {
            System.out.println("both are equal");
        }
        //if(str1==str2) if we use this function then we can get interning concept 
        if(str1.equals(str2))
        {
            System.out.println("this are aslo equals");
        }
        else
        {
            System.out.println("this are not eual");
        }
    }
}
