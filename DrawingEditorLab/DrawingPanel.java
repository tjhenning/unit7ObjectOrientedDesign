import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
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
    boolean nowResize;//true is resize mode
    
        
    public DrawingPanel()
    {        
        shapes=new ArrayList<Shape>();
        setBackground(Color.WHITE);       
        current=new Color(0,0,0);
        addMouseListener(new ClickListener());
        addMouseMotionListener(new MovementListener());
        addKeyListener(new KeysListener());
        
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
            if (lastActiveShape.isOnBorder(point))
            {
                nowResize=true;
                
            }
            else{canDrag=true;}
            lastActiveShape=new Circle(new Point2D.Double(0,0),0,Color.WHITE);
            for (Shape shape:shapes)
            {
                if(shape.isInside(point))
                {
                    dragMode=true;
                    lastActiveShape=shape;
                }
                if(shape.isOnBorder(point))
                {
                    dragMode=false;
                    lastActiveShape=shape;
                }                
            }
            //lastActiveShape.goTo(point.getX(),point.getY());
            
            repaint();
        }
        public void mouseReleased(MouseEvent e)
        {canDrag=false;
        nowResize=false;}
    }
    public class MovementListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent e)
        {
            Point2D.Double point=new Point2D.Double(e.getPoint().getX(),e.getPoint().getY());
            if (dragMode)
            {                
                if (canDrag)
                {
                    lastActiveShape.goTo(point.getX(),point.getY());
                    repaint();
                }
            }
            else
            {                
                if (nowResize)
                {                    
                    lastActiveShape.setRadius(lastActiveShape.getCenter().distance(point));
                    repaint();
                }
            }            
        }
        public void mouseMoved(MouseEvent e)
        {}
     }
    public class KeysListener implements KeyListener
    {
        public void keyPressed(KeyEvent e)
        {
            System.out.println("here");               
            switch(e.getKeyCode()) { 
                case KeyEvent.VK_UP:
                lastActiveShape.move(1,0);
                break;
                case KeyEvent.VK_DOWN:
                lastActiveShape.move(-1,0);
                break;
                case KeyEvent.VK_LEFT:
                lastActiveShape.move(0,-1);
                break;
                case KeyEvent.VK_RIGHT :
                lastActiveShape.move(0,1);
                break;
            }
                       
            if (e.getKeyCode()==KeyEvent.VK_UP)
            {
                lastActiveShape.setRadius(lastActiveShape.getRadius()+1);
            }
            else if (e.getKeyCode()==KeyEvent.VK_DOWN)
            {
                lastActiveShape.setRadius(lastActiveShape.getRadius()-1);
            }
                         
        }
        public void keyReleased(KeyEvent e)
        {}
        public void keyTyped(KeyEvent e)
        {}
    }
}
