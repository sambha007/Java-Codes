package awt;
import java.awt.*;
import java.awt.event.*;
class sambha
{
    public sambha(String title)
    {
        Frame obj =new Frame(title);
        obj.setSize(300,600);
        obj.setVisible(true);
        obj.addWindowListener(new shindeListener());
    }
}
class shindeListener implements WindowListener
{
    

}

public class GUI {
    public static void main(String args[])
    {
       /*  Frame obj= new Frame("sambha");
        obj.setSize(600,600);
        obj.setVisible(true);
        */
        sambha obj=new sambha("shinde");
    }
}
