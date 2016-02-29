
import java.awt.event.MouseListener;
 import java.awt.event.MouseEvent;
 import javax.swing.JFrame;

 /**
 This frame contains a moving rectangle.
 */
public class RectangleFrame2 extends JFrame
    {
     private static final int FRAME_WIDTH = 300;
     private static final int FRAME_HEIGHT = 400;
    
     private TriangleComponent3 scene;
     private int[] xyxy=new int[6];
     //private boolean done=false;
    
     class MousePressListener implements MouseListener
     {
    public void mousePressed(MouseEvent event)
     {
         System.out.println("Clicked.");
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
     scene = new TriangleComponent3();
     add(scene);
     MouseListener listener = new MousePressListener();
     scene.addMouseListener(listener);
    
     setSize(FRAME_WIDTH, FRAME_HEIGHT);
     
     
    }
}