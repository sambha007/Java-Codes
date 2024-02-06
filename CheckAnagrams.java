package distt.String;
import java.util.*;

public class CheckAnagrams {
    public static boolean angrams(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int map[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            map[s1.charAt(i)-'a']++;
            map[s2.charAt(i)-'a']--;
        }
        for(int j=0;j<26;j++)
        {
            if(map[j]!=0)
            {
               return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("enetr first string ");
        String s1=obj.nextLine();
        System.out.println("enter second String ");
        String s2=obj.nextLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(angrams(s1,s2))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    
}
