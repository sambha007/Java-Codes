package distt.ArrayList;
import java.util.ArrayList;
// add() , remove() , set() , contain() , get()
public class Create {
    public static void main(String args[])
    {
        ArrayList<Integer> sam=new ArrayList<>();
        sam.add(4);
        sam.add(8);
        sam.add(9);
        sam.add(23);
        sam.add(12);
        System.out.println(sam);
        int ele=sam.get(3);
        System.out.println(ele);// get() fuction is use for get value at index 
        sam.remove(3);
        System.out.println(sam);//remove()  function is use for remove element from list with spacific index 
        sam.set(3,23);
        System.out.println(sam);// set() function have two parameter like index and value for chnage it can give chnages in that position
        System.out.println(sam.contains(12)+" "+sam);
        sam.add(3,12);// add()   we can also write add function this way
        System.out.println(sam.contains(12)+" "+sam);// contain is give boolean value true/ false for search element

        

    }
}
