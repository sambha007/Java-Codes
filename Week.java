package question;
import java.util.Scanner;
import java.lang.*;

public class Week {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("enetr number 1 to 7 according weekdays");
        int a=obj.nextInt();
        switch(a)
        {
          case 1: 
              System.out.println("monday");
              break;
        case 2:
              System.out.println("tuesday");
              break;
        case 3:
             System.out.println("wednesday");
             break;
        case 4:
              System.out.println("thursday");
              break;
        case 5:
              System.out.println("firday");
              break;
        case 6:
              System.out.println("saturday");
              break;
        case 7:
              System.out.println("Sunday");
              break;
        default :
             System.out.println("this is wrong input");
             break;
    }

 }  
}
