 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import java.awt.Rectangle;
 import java.awt.geom.Line2D;
 import javax.swing.JComponent;
 import java.awt.Dimension;
public class TriangleComponent2 extends JComponent
 {
    
     private Line2D l1;
     private Line2D l2;
     private Line2D l3;
     public TriangleComponent2()
    {
        // The rectangle that the paintComponent method draws
        l1 = new Line2D.Double(0, 0, 0, 0);
        l2 = new Line2D.Double(0, 0, 0, 0);
        l3 = new Line2D.Double(0, 0, 0, 0);
     }
    
     public void paintComponent(Graphics g)
     {
         Graphics2D g2 = (Graphics2D) g;
         g2.draw(l1);
         g2.draw(l2);
         g2.draw(l3);
     }
    
      /**
      Moves the rectangle to the given location.
      @param x the x-position of the new location
      @param y the y-position of the new location
      */
      public void setRectangleTo(int[] x)
      {
        //  l1.setLocation(x, y);
        // repaint();
      }
     public void setTriangleTo(int[] xy)
     {
         l1 = new Line2D.Double(xy[0], xy[1], xy[2], xy[3]);
         l2 = new Line2D.Double(xy[4], xy[5], xy[2], xy[3]);
         l3 = new Line2D.Double(xy[4], xy[5], xy[0], xy[1]);
         repaint();
        }
    } 
     
     
    