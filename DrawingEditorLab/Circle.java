import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

class Circle extends Shape
{
    Ellipse2D.Double circle;
    Color color;
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center,radius,color);
        this.color=color;
        circle= new Ellipse2D.Double(center.getX()-radius,center.getY()-radius,radius*2,radius*2);
    }

    void draw(Graphics2D g2, boolean filled)
    {
        g2.setColor(color);
        if (filled)
        {
            
            g2.fill(circle);
        }
        else
        {
            g2.draw(circle);
        }
    }
}
