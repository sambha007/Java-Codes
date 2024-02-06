package distt.OOPS;
import java.util.*;

class Student
{
    private String name;
    private int roll;
    String collage="sinhgad institute of technology";
    void setName(String name)
    {
        this.name=name;
    }
    void setRoll(int roll)
    {
        this.roll=roll;
    }
    void setNameRoll(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
    String getName()
    {
        return this.name;
    }
    int getRoll()
    {
        return this.roll;
    }
    public void print()
    {
        System.out.println("this is simple method of that class ");
        System.out.println(collage);
        System.out.println(name);
        System.out.println(roll);
    }
}

public class Get_Set {
    public static void main(String args[])
    {
       Student s1=new Student();
       s1.setName("bhausaheb pandurang shinde");
       s1.setRoll(12);
       System.out.println(s1.getName());
       System.out.println(s1.getRoll());
       //System.out.println(s1.name); gives error because private member can not accesiable in other class 
       s1.print();
       Student s2=new Student();
       s2.setNameRoll("sambhaji",143);
       System.out.println(s2.getName()+"\n"+s2.getRoll());
       s2.print();
       s1.print();
       

    }
    
}
