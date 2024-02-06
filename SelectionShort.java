package distt.Sorting;
import java.util.*;

public class SelectionShort {
    public static void selectionShort(int n[])
    {
        
        for(int i=0;i<n.length;i++)
        {
          int minposi =i;
           for(int j=i+1;j<n.length;j++)
           {
              if(n[minposi]>n[j])
              {
                minposi=j;
              }
           }
           int temp=n[i];
           n[i]=n[minposi];
           n[minposi]=temp;
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

    public static void main(String []args)
    {
       int n[]={3,5,6,9,0,3,5,2};
       selectionShort(n);
    }
    
}
