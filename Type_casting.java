import java.util.Scanner;
import java.lang.*;

public class Type_casting {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("enter integer and convert it into float");
        float a =obj.nextInt();
        //byte < short < int <float < long <double
        System.out.println(a);
        float b=99.99f;
        int c=(int)b;
        System.out.println(c);
    }
    
}
