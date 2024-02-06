package distt.Sorting;
import java.util.*;

public class BubbleShort {
    public static int check(int n[])
    {
       for(int i=0;i<n.length-1;i++)
       {
         if(n[i]>n[i+1])
         {
            return 1;
         }
       }
       return 0;
    }
    public static void bubbleShort(int n[])
    {
        for(int i=0;i<n.length-1;i++)
        {
            for(int j=0;j<n.length-1-i;j++)
            {
                if(n[j+1]<n[j])
                {
                    int temp=n[j+1];
                    n[j+1]=n[j];
                    n[j]=temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
        System.out.println("enetr size of array");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("eneter number for index "+i);
            a[i]=sc.nextInt();
        }
        System.out.println("your array ");
        for(int i=0;i<n;i++)
        {
            System.out.println(" at index "+i+" = "+a[i]);
        }
        int m=check(a);
        if(m==1)
        { 
          System.out.println("you need to use bubble short ");
          bubbleShort(a);
        }
        else
        {
            System.out.println("your arry is allready shorted ");
        }
        
         System.out.println("after bubble short ");
         for(int i=0;i<n;i++)
        {
            System.out.println(" at index "+i+" = "+a[i]);
        }
    }
}
