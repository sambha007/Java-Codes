package distt.Array;
import java.util.Scanner;

public class ReverseArray {
    public static void getReverse(int arr[])
    {
        int first=0,last=arr.length-1;
        while(first<last)
        {
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enetr size of array");
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            
            arr[i]=i;
            System.out.println("index "+i+" = "+arr[i]);
        }
        getReverse(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("at index "+i+" = "+arr[i]);
        }


    }
    
}
