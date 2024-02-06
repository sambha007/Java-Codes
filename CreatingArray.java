package distt.Array;
import java.util.*;
import java.lang.*;


public class CreatingArray {
     public static void main(String[] args)throws ArrayIndexOutOfBoundsException
      {
        int ar[]=new int[50];
        for(int i=0;i<50;i++)
        {
            ar[i]=i;
            System.out.print(" "+ar[i]);
        }
        int ar1[]={1,2,3,4,5};
        for(int i=0;i<5;i++)
        {
            System.out.println("\n"+ar1[i]);
        }
        String ar2[]={"sambha","santosh","mayur","shantanu","aashu","eshuu"};
        for(int i=0;i<6;i++)
        {
            System.out.println(ar2[i]);
        }
        
        char ar3[]=new char[26];
        char j='A';
        for(int i=0;i<=26;i++)
        {
            ar3[i]=j;
            j++;
            System.out.println(ar3[i]);
        }
    }
    
}
