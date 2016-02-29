import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.Dimension;
import javax.swing.JColorChooser;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

public class DrawingPanel extends JPanel
{
    ArrayList<Shape> shapes;
    Shape lastActiveShape;
    Color current;
    
        
    public DrawingPanel()
    {        
        shapes=new ArrayList<Shape>();
        setBackground(Color.WHITE);       
        current=new Color(0,0,0);
        
    }
    
    public Color getColor()
    {
        return current;
    }
    
    public Dimension getPreferredSize()
    {
        Dimension d=new Dimension(350,300);
        return d;
    }
    
    public void pickColor()
    {
        current=JColorChooser.showDialog(this, "Choose background color", Color.black);

    }

    public void addCircle()
    {           
        shapes.add(new Circle(new Point2D.Double(100,100),15,current));
        repaint();
    }
    
    public void addSquare()
    {
        shapes.add(new Square(new Point2D.Double(100,100),15,current));
        repaint();
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Shape shape:shapes)
        {
            shape.draw(g2,true);
        }
        //g2.repaint();
        // System.out.println(current);
    }
    public class ClickListener implements MouseListener
    {
       public void mouseClicked(MouseEvent e)
       {}
       public void mouseEntered(MouseEvent e)
       {}
       public void mouseExited(MouseEvent e)
       {}
       public void mousePressed(MouseEvent e)
       {}
       public void mouseReleased(MouseEvent e)
       {}
    }
    public class MovementListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent e)
        {}
        public void mouseMoved(MouseEvent e)
        {}
    }
}
