import java.lang.*;
import java.util.*;

public class Gst_bill {
    public static void main(String args[])
    {
        int $=100;
        System.out.println($);
        Scanner obj=new Scanner(System.in);
        System.out.println("enter pencil price");
        float a=obj.nextFloat();
        System.out.println("enter pen price");
        float b=obj.nextFloat();
        System.out.println("enter eraser price");
        float c=obj.nextFloat();
        double tot =a+b+c;
        double gst1=tot*18;
        double gst=gst1/100;
        System.out.println("total bill of your purches "+tot);
        System.out.println("Gst of your bill "+gst);
        double d=tot+gst;
        System.out.println("your payable amout is "+tot+" + "+gst+" = "+d);

    }
    
}
