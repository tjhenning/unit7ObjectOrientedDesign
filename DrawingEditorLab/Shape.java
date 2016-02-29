import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;

public abstract class Shape
{
    Point2D.Double center;
    double radius;
    Color color;
    public Shape(Point2D.Double center, double radius, Color color)
    {
        this.center=center;
        this.radius=radius;
        this.color=color;
    }
    
    public Point2D.Double getCenter()
    {
        return center;
    }
    
    double getRadius()
    {
        return radius;
    }
    
    void move(double x, double y)
    {
        center=new Point2D.Double(center.getX()+x,center.getY()+y);
    }
    
    void setRadius(double r)
    {
        radius=r;
    }
    
    boolean isInside(Point2D.Double point)
    {
        return (center.distance(point)<radius);
    }

    boolean isOnBorder(Point2D.Double point)
    {
        return (center.distance(point)==radius);
    }
    
    abstract void draw(Graphics2D g2,boolean filled);  
}
