package distt.Array;
import java.util.*;

public class PairsInArray {
    public static void getPair(int a[])
    {
        int temp=0;

        for(int i=0;i<a.length;i++)
        {
            int curr=a[i];
            for(int j=i+1;j<a.length;j++)
            {
               System.out.print("("+curr+","+a[j]+")"+" ");
               temp++;
            }
            System.out.println();

            
        }
        System.out.println("total pairs are "+temp);
    }
    public static void main(String args[])
    {
        System.out.println("enetr size of array");
        Scanner obj =new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=i+1;
        }
        getPair(a);
        
    }
    
}
