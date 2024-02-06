package distt.ArrayList;
import java.util.ArrayList;
// size()

public class ArrayOperation {
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(78);
        list.add(914546585);
        
        for(int i=0;i<list.size();i++)
        {
            list.add(i);
            if(i==10)
            {
                break;
            }
            System.out.println(list.get(i));
        }
        System.out.println(" index 12  "+list.get(12));
         for(int j=list.size()-1;j>=0;j--)
        {
            System.out.println(list.get(j));
        }
    }
    
}
