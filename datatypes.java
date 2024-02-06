import java.util.*;

import javax.sound.sampled.AudioFileFormat.Type;

import org.w3c.dom.TypeInfo;

import java.lang.*;
// this is code for identify data types

public class datatypes {
      public static void main(String args[])
      {
        Scanner obj =new Scanner(System.in);
        
        System.out.println("enetr integer");
        int a=obj.nextInt();
        System.out.println("enetr flaot ");
        float b=obj.nextFloat();
        System.out.println("enetr long ");
        long c= obj.nextLong();
        System.out.println("enetr double ");
        double d= obj.nextDouble();
        System.out.println("enetr byte ");
        byte e= 8;
        System.out.println("enetr short ");
        short f=obj.nextShort();
        System.out.println("enetr char ");
        char g='M';
        System.out.println("enetr boolean ");
        boolean h=true;
        System.out.println("enetr string ");
        String ar=obj.nextLine();
        System.out.println("enetr array ");
        int arra[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arra[i]=i;
        }
        System.out.println(" ***********************show all ********************* ");
        System.out.println("this is integer "+a);
        


      }
    
}
