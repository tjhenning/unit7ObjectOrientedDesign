import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Rectangle;


class Square extends Shape
{
    Rectangle rect;
    Color color;
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center,radius,color);
        this.color=color;
        rect=new Rectangle((int)(center.getX()-radius),(int)(center.getY()-radius),(int)radius*2,(int)radius*2);
    }
    void draw(Graphics2D g2, boolean filled)
    {
        g2.setColor(color);
        if (filled)
        {            
            g2.fill(rect);
        }
        else
        {
            g2.draw(rect);
        }
    }
}

