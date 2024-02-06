import java.util.Scanner;
import java.lang.*;

public class Area_circle {
    public static void main(String ar[])
    {
        System.out.println("calculate the area of circle ");
        Scanner obj = new Scanner(System.in);
        System.out.println("enter radius of circle ");
        double r =obj.nextDouble();
        double area = 3.14*r*r;
        System.out.println(area);

        
    }
    
}
