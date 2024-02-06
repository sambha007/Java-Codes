package distt.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Swap {
    public static void swap(ArrayList<Integer>list,int ind1,int ind2)
    {
        int temp=list.get(ind1);
        list.set(ind1,list.get(ind2));
        list.set(ind2,temp);
        System.out.println("after change \n"+list);
    }
    public static void sort(ArrayList<Integer>list)
    {
        Collections.sort(list);
        System.out.println("After sorting \n"+list);

    }
    public static void desort(ArrayList<Integer>list)
    {
        Collections.sort(list,Collections.reverseOrder());
    }
    public static void main(String args[])
    {
       ArrayList<Integer> list=new ArrayList<>();
       for(int i=0;i<15;i++)
       {
        list.add(i*5);
       }
       System.out.println(list);
       swap(list,3,9);
       list.set(4,8);
       list.add(7,4);
       list.add(10,78);
       System.out.println("new list is \n"+list);
       sort(list);
       desort(list);
       System.out.println(list);

    }
    
}
