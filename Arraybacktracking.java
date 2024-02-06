package distt.Backtracking;

public class Arraybacktracking {
    public static void arrback(int arr[],int i,int j)
    {
       if(i==arr.length)
       {
        pr(arr);
        return;
       }
       arr[i]=j;
       arrback(arr, i+1, j+1);
       arr[i]=arr[i]+5;
       
       
    }
    public static void pr(int arr[])
    {
       for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String args[])
    {
        int ar[]=new int[5];
        //int j=1;
        //int i=0;
        arrback(ar,0,1);
        pr(ar);

        
    }
    
}
