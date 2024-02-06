package distt.Array;
import java.util.*;

public class SubArray {
    public static void getSub(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            
            for(int j=i+1;j<a.length;j++)
            {
            
                for(int k=i;k<j;k++)
                {
                    System.out.print(a[k]);
                }
                System.out.println();
            }
            System.out.println();

        }
    }
    public static void main(String args[])
    {
        System.out.println("enter size ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=i+1;
        }
        getSub(a);
    }
    
}
