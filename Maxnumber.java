package distt.ArrayList;
import java.util.ArrayList;


public class Maxnumber {
    public static void main(String ar[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<=10;i++)
        {
            list.add(i+2*3);
        }
        System.out.println(list);
        list.add(5,100);
        System.out.println(list);
        int max=Integer.MIN_VALUE;
        int temp=0;
        for(int i=0;i<list.size();i++)
        {
             if(max<list.get(i))
            {
               // max=list.get(i);
                temp=i;
                
            }
            max=Math.max(max,list.get(i));
        }
        System.out.println(" maximum number is "+max+" at index "+temp);

    }
    
}
