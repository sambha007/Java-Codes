package distt.String;
import java.util.*;

public class Anagrams {
    public static void check(String str1,String str2)
    {
        int m=0;
        if(str1.length()==str2.length())
        {
           for(int i=0;i<str1.length();i++)
           {
             char ch=str1.charAt(i);
             for(int j=0;j<str2.length();j++)
             {
                char ch1=str2.charAt(j);
                if(ch==ch1)
                {
                    m++;
                }
             }
           }
        }
        else
        {
           System.out.println(" String not Anagrams ");
        }
        if(m==str1.length())
        {
            System.out.println("this is anagrams ");
        }
        else
        {
            System.out.println(" this not anagrams ");
        }

    }
    public static void checkAnagrams(String str1,String str2)
    {
        if(str1.length()==str2.length())
        {
           char[] s1=str1.toCharArray();
           char[] s2=str2.toCharArray();
           Arrays.sort(s1);
           Arrays.sort(s2);
           boolean result=Arrays.equals(s1,s2);
           if(result==true)
           {
            System.out.println(" this is anagrams");
           }
           else
           {
            System.out.println("this is not Anagrams");
           }
        }
        else
        {
            System.out.println("this is not Anagrams");
        }
    }
    public static void main(String []a)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter string 1");
        String str1=obj.nextLine();
        System.out.println("entre second string 2");
        String str2=obj.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        check(str1,str2);
        checkAnagrams(str1, str2);
    }
    
}
