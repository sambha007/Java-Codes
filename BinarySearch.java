package distt.Array;
import java.util.*;
public class BinarySearch {
    public static void shor(int a[])
    {
        int last=a.length-1;
        for(int i=0;i<last;i++)
        {
            for(int j=0;j<last-i;j++)
            {
               if(a[j+1]<a[j])
               {
                int temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
               }
            }
        }
       
    }
    public static int getBinary(int a[],int num)
    {
        int start=0,end=a.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(a[mid]==num)
            {
                return mid;
            }
            else if (a[mid]<num)
            {
               start=mid+1;
            }
            else
            {
                end=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] ar)
    {
        int a[]={1,2,34,56,78,23,45,5,59};
        shor(a);
        for(int i=0;i<a.length;i++)
        {
        System.out.println(a[i]);
        }
        System.out.println("enetr number you want to search ");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int ans=getBinary(a,x);
        if(ans==-1)
        {
            System.out.println("number is not present ");
        }
        else
        {
            System.out.println("number is present at index "+ans);
        }

    }
    
}
