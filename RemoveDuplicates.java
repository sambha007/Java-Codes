package distt.Recursion;
import java.util.*;

public class RemoveDuplicates {
    public static void remove(String str,int idx ,StringBuilder newstr,boolean map[] )
    {
        if(idx==str.length())
        {
            newstr.deleteCharAt(0);
            System.out.println(newstr);
            return ;
        }
        char test=str.charAt(idx);
        if(map[test-'a']==true)
        {
            remove(str, idx+1, newstr, map);
        }
        else
        {
            map[test-'a']=true;
            remove(str, idx+1, newstr.append(test), map);
        }
    }
    public static void main(String ar[])
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("entre String ");
        String str=obj.nextLine();
        remove(str,0,new StringBuilder(" "),new boolean[26]);

    }
    
}
