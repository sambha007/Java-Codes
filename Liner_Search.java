package distt.Array;
import java.util.*;

public class Liner_Search {
    public static void large(int ar[])
    {
        int n=Integer.MIN_VALUE;
        int m=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>n)
            {
                n=ar[i];
            }
            if(ar[i]<m)
            { 
               m=ar[i];
            }
        }
        System.out.print(" = "+n+"\n");
        System.out.println("smallest value of in this list is "+m);
    }
    public static int linear(int ar[],int num)
    {
        int m=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==num)
            {
                m=1;
            }
        }
        return m;
    }
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("enetr size you want ");
        int n=obj.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println(" enter vole for this index "+i);
            ar[i]=obj.nextInt();
        }
        System.out.println("your entered values are ");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println("\nwhich number you want to search ");
        int num=obj.nextInt();
        int  ans=linear(ar,num);
        if(ans==1)
        {
            System.out.println("number is present ");
        }
        else
        {
            System.out.println(" number is not present ");
        }
        System.out.print("largest number among your enter numbers is ");
        large(ar);
    }
}
