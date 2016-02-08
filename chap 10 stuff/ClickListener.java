import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ClickListener implements ActionListener
{
    private int count;
    
    public ClickListener()
    {
        count=1;
    }
    
    public void actionPerformed(ActionEvent event)
    {
        count+=count;
        System.out.println("I was clicked "+count+" time(s)");
    }
}