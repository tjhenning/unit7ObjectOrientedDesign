 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import java.awt.Rectangle;
 import java.awt.geom.Line2D;
 import javax.swing.JComponent;
 import java.awt.Dimension;
 import java.awt.image.BufferedImage;
 import java.awt.Image;
 import javax.swing.ImageIcon;
 
public class TriangleComponent3 extends JComponent
 {
    
   
     public TriangleComponent3()
    {
        BufferedImage image = new BufferedImage(256, 256,
    BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Image  img = new ImageIcon("sandwich.jpg").getImage();
        System.out.println(img);
        g2.drawImage(img,0,0,null);
        repaint();
     }
    
     public void paintComponent(Graphics g)
     {
         
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
         
         repaint();
        }
    } 
     
     
    