
import java.awt.event.MouseListener;
 import java.awt.event.MouseEvent;
 import javax.swing.JFrame;
  import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 /**
 This frame contains a moving rectangle.
 */
public class RectangleFrame2 extends JFrame
    {
     private static final int FRAME_WIDTH = 300;
     private static final int FRAME_HEIGHT = 400;
     private JButton button=new JButton("Draw");
     private JOptionPane scene=new JOptionPane();
     private CircleComponent2 scene2=new CircleComponent2();
     private int[] xyxy=new int[6];
     //private boolean done=false;
    
     class MousePressListener implements MouseListener
     {
    public void mousePressed(MouseEvent event)
     {
         
     }
     public void mouseReleased(MouseEvent event) {}
     public void mouseClicked(MouseEvent event) 
        {
         
        }
     public void mouseEntered(MouseEvent event) {
        }
     public void mouseExited(MouseEvent event) {}
    }
     public RectangleFrame2()
     {    
     ClickListener listener = new ClickListener();
        button.addActionListener(listener);
         add(button);
     setSize(100, 100);
     
     
     
    }
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {        
            remove(button);
            add(scene);
            
     String x = JOptionPane.showInputDialog("Input x value: ");
     String y = JOptionPane.showInputDialog("Input y value: ");
     String r = JOptionPane.showInputDialog("Input radius: ");
     add(scene2);   
     int r2=Integer.parseInt(r);
     int[] d= {Integer.parseInt(x),Integer.parseInt(y),r2,r2};
     scene2.setCircleTo(d);
     setSize(FRAME_WIDTH, FRAME_HEIGHT);
        }
    }
}