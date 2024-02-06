package distt.Two_2D_Array;

public class Sumofdigonal {
    public static void printSumOfDigonal(int m[][])
    {
        int sum=0;
        int sum1=0;
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                if(i==j)
                {
                    sum=sum+m[i][j];
                }
                if(i+j==m.length-1)
                {
                  sum1=sum1+m[i][j];
                }

            }
        }
        System.out.println("primary digonal "+sum);
        System.out.println("secnodary digonal "+sum1);

    }
    public static void main(String args[])
    {
        int m[][]=new int[4][4];
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                m[i][j]=i+j;
            }
        }
         for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
        printSumOfDigonal(m);
    }
    
}
