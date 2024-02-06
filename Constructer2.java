package distt.OOPS;
import java.util.*;

class Bike2
{
    String name;
    String dep;
    char div;
    int roll;
    Bike2()
    {
        System.out.println("this is constructer ");
    }
    Bike2(String name)
    {
        System.out.println("name is "+name);
    }
    Bike2(String name,String deparment,int roll,char div)
    {
        this.name=name;
        this.dep=deparment;
        this.div=div;
        this.roll=roll;
    }
    void print()
    {
        System.out.println("name = "+name+"\n"+"Deparment = "+dep);
        System.out.println("div = "+div+"\n"+"roll = "+roll);
    }
}
public class Constructer2
{
    public static void main(String []args)
    {
        Bike2 m1=new Bike2("Sambha");
        Bike2 m2=new Bike2();
        Bike2 m3=new Bike2("bhausaheb ", " computer ", 21, 'A');
        m3.print();
    }

}