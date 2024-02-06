package distt.Sorting;

public class InsertionSort {
    public static void insertion(int n[])
    {
        for(int i=1;i<n.length;i++)
        {
            int curr=n[i];
            int prev=i-1;
            while(prev>=0&&n[prev]>curr)
            {
                n[prev+1]=n[prev];
                prev--;
            }
            n[prev+1]=curr;
        }
        prit(n);
    }
    public static void prit(int n[])
    {
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]);
        }
    }
    public static void main(String args[])
    {
        int n[]={1,4,5,8,3,4,2};
        insertion(n);
    }
}
