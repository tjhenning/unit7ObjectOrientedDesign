
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
    
     private RectangleComponent2 scene;
     private int[] xyxy=new int[4];
     //private boolean done=false;
    
     class MousePressListener implements MouseListener
     {
    public void mousePressed(MouseEvent event)
     {
         //int x = event.getX();
        // int y = event.getY();
         if (xyxy[0]==0)
         {
             xyxy[0]=event.getX();
             xyxy[1]=event.getY();
             int[] d={xyxy[0],xyxy[1],xyxy[0]+1,xyxy[1]+1};
             scene.setRectangleTo(d );
            }
         else if(xyxy[2]==0)
         {
             xyxy[2]=event.getX();
             xyxy[3]=event.getY();
             scene.setRectangleTo(xyxy);
             xyxy=new int[4];//{0,0,0,0);
            }
        //    else {
        // scene.moveRectangleTo(event.getX(), event.getY());
        //}
     }
    
     // Do-nothing methods
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
     scene = new RectangleComponent2();
     add(scene);
     MouseListener listener = new MousePressListener();
     scene.addMouseListener(listener);
    
     setSize(FRAME_WIDTH, FRAME_HEIGHT);
     
     
    }
}