package distt.function;
import java.util.*;
import java.lang.*;

public class DecimalToBinary {
    public static void decima(int a)
    {
        int pow =0;
        int denum=0;
        int num=a;

        
        while(0<a)
        {
            int ls=a%10;
            denum=denum+(ls*(int)Math.pow(2,pow));
            pow++;
            a=a/10;
        }
        System.out.println("this is binary to decimal "+num +"="+denum);
        bina(denum);
    }
    public static void bina(int a)
    {
        int num=a;
        int pow=0;
        int sum=0;
        while(a>0)
        {
            int ls=a%2;
            sum=sum+(ls*(int)Math.pow(10, pow));
            pow++;
            a=a/2;
        }
        System.out.println("this decimal to binary "+num+" ="+sum);
       
    }

    public static void main(String args[])
    {
        
        System.out.println("enetr number to cunvert into decimal");
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        decima(a);

        
        

    }
    
}
