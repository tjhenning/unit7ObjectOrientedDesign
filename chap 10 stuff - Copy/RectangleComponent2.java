 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import java.awt.Rectangle;
 import javax.swing.JComponent;
 import java.awt.Dimension;
public class RectangleComponent2 extends JComponent
 {
     private static final int BOX_X = 100;
     private static final int BOX_Y = 100;
     private static final int BOX_WIDTH = 20;
     private static final int BOX_HEIGHT = 30;
    
     private Rectangle box;
    
     public RectangleComponent2()
    {
        // The rectangle that the paintComponent method draws
        box = new Rectangle(0, 0, 0, 0);
     }
    
     public void paintComponent(Graphics g)
     {
         Graphics2D g2 = (Graphics2D) g;
         g2.draw(box);
     }
    
     /**
     Moves the rectangle to the given location.
     @param x the x-position of the new location
     @param y the y-position of the new location
     */
     public void moveRectangleTo(int x, int y)
     {
         box.setLocation(x, y);
        repaint();
     }
     public void setRectangleTo(int[] xy)
     {
         Dimension d = new Dimension(Math.abs(xy[0]-xy[2]),Math.abs(xy[1]-xy[3]));         
         box.setSize(d);
         if(xy[0]>xy[2]&&xy[1]>xy[3])
         {
             box.setLocation(xy[2], xy[3]);
            }
         else if (xy[0]>xy[2])
         {
             box.setLocation(xy[2], xy[1]);
            }
            else if(xy[1]>xy[3])
            {
                 box.setLocation(xy[0], xy[3]);
            }
            else{
         box.setLocation(xy[0], xy[1]);}
         repaint();
        }
    } 
     
     
    