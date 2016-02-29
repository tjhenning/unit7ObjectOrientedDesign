 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import java.awt.geom.Ellipse2D;
 import javax.swing.JComponent;
 import java.awt.Dimension;
public class CircleComponent2 extends JComponent
 {
     private static final int BOX_X = 100;
     private static final int BOX_Y = 100;
     private static final int BOX_WIDTH = 20;
     private static final int BOX_HEIGHT = 30;
    
     private Ellipse2D.Double box;
    
     public CircleComponent2()
    {
        // The Circle that the paintComponent method draws
        box = new Ellipse2D.Double(0, 0, 0, 0);
     }
    
     public void paintComponent(Graphics g)
     {
         Graphics2D g2 = (Graphics2D) g;
         System.out.println("Here");
         g2.draw(box);
     }
    
     /**
     Moves the Circle to the given location.
     @param x the x-position of the new location
     @param y the y-position of the new location
     */
     public void moveCircleTo(int x, int y)
     {
         box.setFrame(x, y,1,1);
        repaint();
     }
     public void setCircleTo(int[] xy)
     {              
         box.setFrame(xy[0],xy[1],xy[2],xy[3]);
         repaint();
        }
    } 
     
     
    