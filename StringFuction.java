package distt.String;
import java.util.*;
public class StringFuction {
    public static void getSingleword(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");//charAt() fuction use for separate words 
        }
        System.out.println("\n"+strs.toUpperCase());
    }
    public static void main(String args[])
    {
        String collage="sinhgad institute of technology";
        String depa=new String("Computer Deparment");
        String str;
        Scanner obj =new Scanner(System.in);
        System.out.println("enetr name ");
        str=obj.next();
        System.out.println("enetr last name");
        String str1=obj.next();//input of single word 
        System.out.println(collage+"\n"+depa);
        System.out.println("your name is "+str+" "+str1);//conctation happen here 
        System.out.println(str.length()+" "+str1.length());
        getSingleword(collage);
    }
}
