package distt.OOPS;
import java.util.*;

class Test
{
    String name;
    int pr;
    int roll;
    public void print()
    {
       
         System.out.println(name);
         System.out.println(roll);
         System.out.println(pr);
        
    }
}
public class ClassObject {
    public static void main(String []args)
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("this main function program get Strated ");
        Test t1=new Test();
        System.out.println("enetr name of student ");
        t1.name=obj.nextLine();
        System.out.println("enetr roll number of student ");
        t1.roll=obj.nextInt();
        System.out.println("enter prn number of student ");
        t1.pr=obj.nextInt();
        t1.print();

    }
    
}
