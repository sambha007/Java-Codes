import java.lang.*;
import java.util.*;

public class Average_of_3_number {
    public static void main(String args[])
    {
        System.out.println("enetr 3 number to calculate the avaerage");
        Scanner obj =new Scanner(System.in);
        int a,b,c;
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        int tot;
        double ans;
        tot=a+b+c;
        ans=tot/3;
        System.out.println(ans);

    }
    
}
