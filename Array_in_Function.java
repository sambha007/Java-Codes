package distt.Array;
import java.util.*;

public class Array_in_Function {
    public static void arr(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=i*i;
        }
    }
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("enter how much you size want of your array ");
        int n=obj.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=i;
            System.out.println(i+" = "+ar[i]);
        }
        arr(ar);
        for(int i=0;i<ar.length;i++)
        {
            System.out.println("this is change "+i+" = "+ar[i]);
        }
       
    /*  int i=0;
      do
      {
        System.out.println(i);
        i++;
      }while(i<10);
      */
    }
}
