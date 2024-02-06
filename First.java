package distt.Two_2D_Array;
import java.util.*;
public class First {
    public static void getLargest(int matrix[][])
    {
        int l=matrix[0][0];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(l<matrix[i][j])
                {
                  l=matrix[i][j];
                }
            }
        }
        System.out.println("largest element is "+l);
    }
    public static void getSmallest(int matrix[][])
    {
        int s=matrix[0][0];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(s>matrix[i][j])
                {
                  s=matrix[i][j];
                }
            }
        }
        System.out.println("smallest element is "+s);
    }
    public static void main(String args[])
    {
        int matrix[][]=new int [4][4];
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number for matrix\n");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                matrix[i][j]=i*2+2+j*2;
                
            }
        }
        matrix[3][3]=1;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        getSmallest(matrix);
        getLargest(matrix);
    }
    
    
}
