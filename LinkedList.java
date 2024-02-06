package distt.LinkedList;
import java.util.*;

public class LinkedList {
    /**
     * node
     */
    public class Node {
           int data ;
           Node next;

           public Node(int data)
           {
             this.data=data;
             next=null;
           }
    
        
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data)
    {
        Node nn=new Node(data);
        if(head==null)
        {
            head=tail=nn;
            return;
        }
        nn.next=head;
        head=nn;
    }
    public void addLast(int data)
    {
        Node nn=new Node(data);
        if(tail==null)
        {
            head=tail=nn;
            return;
        }
        tail.next=nn;
        tail=nn;
    }
    public void addSelected(int ind,int data)
    {
         Node nn=new Node(data);
         if(size==0)
         {
            head=tail=nn;
            return;
         }
         Node temp=head;
         int i=0;
         while (i<ind-1) {
            temp=temp.next;
            i++;   
         }
         nn.next=temp.next;
         temp.next=nn;
         
    }
    public void print()
    {
       
        if(size==1)
        {
            System.out.print(head.data+" -> ");
        }
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data +" -> ");
            temp=temp.next;
        }
        System.out.println(" null ");

    }

    public void removeFirst()
    {
        if(size==0)
        {
            System.out.println(" linked list is empty ");
            return;
        }
        else if(size==1)
        {
            head=tail=null;
        }
        head=head.next;
    }
    public void removeLast()
    {
        if(size==0)
        {
            System.out.println(" linked list is empty ");
            return;
        }
        else if(size==1)
        {
            head=tail=null;
        }
        Node temp=head;
        for(int i=0;i<size-2;i++)
        {
            temp=temp.next;
        }
        tail=temp;
        temp.next=null;
       
    
    }
    public void removeSelected(int ind)
    {
        if(size==0)
        {
            System.out.println(" linked list is empty ");
            return;
        }
         else if(size==1)
        {
            head=tail=null;
        }
        Node temp=head;
        Node prev=head;
        for(int i=0;i<ind-1;i++)
        {
            temp=temp.next;
        }
        for(int i=0;i<ind-2;i++)
        {
            prev=prev.next;
        }
        prev.next=temp.next;

    }

    public boolean search(int key)
    {
        if(size==0)
        {
            System.out.println("is empty");
            return false;
        }
        Node temp=head;
        while (temp.next!=null) {
            if(temp.data==key)
            {
                return true;
            }
            temp=temp.next;
            
        }
        return false;
    }


    public static void main(String args[])
    {
         System.out.println("............Start Linked............. ");
         Scanner obj=new Scanner(System.in);
         LinkedList ll =new LinkedList();
         int ch;


        do
        {
             System.out.println("*********** Select Operation ************");
             System.out.println("1) insert ");
             System.out.println("2) Display ");
             System.out.println("3) remove ");
             System.out.println("4) search ");
             System.out.println("5) exit ");
             System.out.println("6)size of link list ");
             System.out.println(" ---- enter your choise ----");
            ch=obj.nextInt();

             switch (ch) {
                case 1:
                       size++;
                       System.out.println(" Enter element for insert  ");
                       int data=obj.nextInt();
                       System.out.println(" ---where you want insert ---");
                       System.out.println("     1) insert at first ");
                       System.out.println("     2) insert at last ");
                       System.out.println("     3) insert at your choise  ");
                       System.out.println("enetr your option ");
                       int a=obj.nextInt();
                       switch (a) {
                        case 1:
                              ll.addfirst(data);
                              break;
                        case 2:
                              ll.addLast(data);
                              break;
                        case 3: 
                             System.out.println(" enetr index where you want to insert\n ");
                             int ind=obj.nextInt();
                             ll.addSelected(ind,data);
                             break;
                        default:
                            break;
                       }
                       break;
                case 2:
                       ll.print();
                       break;
                case 3:
                       size--;
                       System.out.println(" ---which node you want remove ---");
                       System.out.println("     1) remove at first ");
                       System.out.println("     2) remove at last ");
                       System.out.println("     3) remvoe at your choise  ");
                       System.out.println("enetr your option ");
                       int b=obj.nextInt();
                      switch (b) {
                        case 1:
                              ll.removeFirst();
                              break;
                        case 2:
                              ll.removeLast();
                              break;
                        case 3: 
                             System.out.println(" enetr index where you want to remove\n ");
                             int ind=obj.nextInt();
                             ll.removeSelected(ind);
                             break;
                        default:
                            break;
                       }
                       break;
                case 4:
                       System.out.println("Enter element for search ");
                       int key=obj.nextInt();
                       System.out.println(ll.search(key));
                       break;
                case 5:
                       break;
                case 6:
                      System.out.println(size);
                      break;
                default:
                    break;
             }





           


        }while(ch!=5);

    }
    
}
