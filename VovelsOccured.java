package distt.String;
import java.util.*;

public class VovelsOccured {
    public static void countVovels(String str)
    {
        int count=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count++;
                sb.append(ch);
            }
        }
        System.out.println(" total lowercase vovels are present in string are = "+count);
        System.out.println(sb);
    }
    public static void main(String []ar)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enetr string");
        String str=obj.nextLine();
        countVovels(str);
    }
    
}
