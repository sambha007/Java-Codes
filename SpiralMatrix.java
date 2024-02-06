package distt.Two_2D_Array;

public class SpiralMatrix {
    public static void getSpiral(int matrix[][])
    {
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(startrow<=endrow&&startcol<=endcol)
        {
             for(int j=startcol;j<=endcol;j++)
             {
               System.out.print(matrix[startrow][j]+" "); 
             }
             for(int i=startrow+1;i<=endrow;i++)
             {
                System.out.print(matrix[i][endcol]+" ");
             }
             for(int j=endcol-1;j>=startcol;j-- )
             {
                System.out.print(matrix[endrow][j]+" ");
             }
             for(int i=endrow-1;i>=startrow+1;i--)
             {
                System.out.print(matrix[i][startcol]+" ");
             }
             startcol++;
             startrow++;
             endcol--;
             endrow--;
        } 
    }

    public static void main(String args[])
    {
        int matrix[][]=new int[5][5];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=i+2+i*3+j;
            }
        }
        System.out.println("your matrix is ");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println();
        }
        getSpiral(matrix);

    }
    
}
