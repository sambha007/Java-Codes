package distt.Array;
import java.util.*;

public class MaxSumSubarray {
    public static void maxsum(int n[])
    {
        int currsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++)
        {
           for(int j=i;j<n.length;j++)
           {
             currsum=0;
             for(int k=i;k<=j;k++)
             {
                currsum=currsum+n[k];
             }
             System.out.println(" currnt sum is "+currsum);
             if(max<currsum)
             {
                max=currsum;
             }
           
           }
        }
        System.out.println("over all max sum is "+max);
    }

    public static void main(String args[])
    {
        int n[]={2,4,6,8,10};
        maxsum(n);

    }
}
