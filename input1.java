import java.io.DataInputStream;
import java.io.IOException;
import java.lang.*;
import java.util.*;
public class input1 {
    public static void main(String ar[])throws IOException
    {
        int age ;
        double avg;
        String s;
        System.out.println("enetr input for given program..");
        DataInputStream obj=new DataInputStream(System.in);
        s=obj.readLine();
        age=Integer.parseInt(s);
        System.out.println("age is"+age);
        System.out.println("enetr avg marks");
        s=obj.readLine();
        avg=Double.parseDouble(s);
        System.out.println("average marks is "+avg);

    }
}
