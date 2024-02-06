package distt.String;
import java.util.*;

public class CompressString {
    public static void getComparess(String str)
    {
        StringBuilder sb=new StringBuilder(" ");
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1)
            {
                sb.append(count.toString());
            }
        }
        System.out.println(sb);
    }
    public static void main(String []args)
    {
       Scanner obj =new Scanner(System.in);
       System.out.println("enetr string ");
       String str=obj.nextLine();
       getComparess(str);
    }
    
}
