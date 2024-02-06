package distt.Sorting;

public class CountingSort {
    public static void countsort(int n[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++)
        {
            largest=Math.max(largest, n[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<n.length;i++)
        {
            count[n[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                n[j]=i;
                j++;
                count[i]--;
            }
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
        int n[]={1,3,4,6,8,2,3,2,1};
        countsort(n);
    }
    
}
