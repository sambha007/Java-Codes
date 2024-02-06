package distt.String;
import java.util.*;

public class CheckPalindram {
    public static void check(String str)
    {
        int n=str.length()-1;
        boolean m=true;
        for(int i=0;i<str.length()/2;i++)
        {
          if(str.charAt(i)!=str.charAt(n))
          {
             m=false;
          }
          n--;
        }
        if(m==true)
        {
            System.out.println("this is palindram String ");
        }
        else
        {
            System.out.println("this is not palindram String ");
        }
    }
    public static void main(String []ar)
    {
        String str="sinhgad institute of technolgy ";
        System.out.println(str);
        System.out.println("enter string");
        Scanner obj=new Scanner(System.in);
        String str1=obj.nextLine();
        check(str1);

    }
    
}
