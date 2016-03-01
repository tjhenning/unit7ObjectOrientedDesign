import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionListener;
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
    Shape lastActiveShape=new Circle(new Point2D.Double(1,1),1,Color.WHITE);
    Color current;
    boolean dragMode;//true is drag, false is resize
    boolean canDrag=false;//true if currently dragging
    
        
    public DrawingPanel()
    {        
        shapes=new ArrayList<Shape>();
        setBackground(Color.WHITE);       
        current=new Color(0,0,0);
        addMouseListener(new ClickListener());
        addMouseMotionListener(new MovementListener());
        
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
            if (!shape.equals(lastActiveShape))
            {
                shape.draw(g2,true);
            }
        }
        if (lastActiveShape!=null)
        {
            lastActiveShape.draw(g2,false);
        }
        
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
        {            
            
            Point2D.Double point=new Point2D.Double(e.getPoint().getX(),e.getPoint().getY());
            for (Shape shape:shapes)
            {
                if(shape.isOnBorder(point))
                {
                    dragMode=false;
                    lastActiveShape=shape;
                }
                if(shape.isInside(point))
                {
                    dragMode=true;
                    lastActiveShape=shape;
                }
            }
            lastActiveShape.goTo(point.getX(),point.getY());
            canDrag=true;
            repaint();
        }
        public void mouseReleased(MouseEvent e)
        {canDrag=false;
        System.out.println("Nope");}
    }
    public class MovementListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent e)
        {
            
            Point2D.Double point=new Point2D.Double(e.getPoint().getX(),e.getPoint().getY());
            if (dragMode)
            {                
                if (!canDrag)
                {
                    lastActiveShape.goTo(point.getX(),point.getY());
                    repaint();
                }
            }
            else
            {
                lastActiveShape.setRadius(lastActiveShape.getCenter().distance(point));
            }
            
        }
        public void mouseMoved(MouseEvent e)
        {}
    }
}
