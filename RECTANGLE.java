package distt.pattern;
import java.lang.*;

public class RECTANGLE {
    public static void main(String args[])
    {
        for(int i=0;i<2;i++)
        {
            if(i==0)
            {
            System.out.println(" * * * * *");
            }
            for(int j=0;j<5;j++)
            {
                if(j==0||j==4)
                {
                    System.out.print(" *");
                    if(j==4)
                    {
                        System.out.println();
                    }
                }
                else
                {
                    System.out.print("  ");
                }
            }
            if(i==1)
            {

                System.out.println(" * * * * *");
            }
        }
    }
    
}
