package distt.Recursion;
import java.util.Scanner;

public class OccuranceInArray {
    public static void count(int arr[],int key,int i)
    {
        if(i==arr.length)
        {
            return ;
        }
        if(arr[i]==key)
        {
            System.out.print(i+" ");
            count(arr, key, i+1);
        }
        else
        {
            count(arr, key, i+1);
        }
    }
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int arr[]={1,2,3,3,2,4,5,3,7,8,2,1};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("\n enetr array element to search ");
        int key=obj.nextInt();
        count(arr,key,0);

        
    }
    
}
