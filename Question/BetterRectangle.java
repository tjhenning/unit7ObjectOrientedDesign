import java.awt.Rectangle;
import java.awt.Dimension;

public class BetterRectangle extends Rectangle
{
    public BetterRectangle( int x, int y, int sizex,int sizey)
    {
        super(x, y, sizex, sizey);
        //Dimension dim=new Dimension(sizex,sizey);
        //setSize(dim);
        //setLocation(x,y);
    }

    public double getPerimeter()
    {        
        return 2*(getHeight()+getWidth());
    }

    public double getArea()
    {
        return getHeight()*getWidth();
    }
    public static void main()
    {
        BetterRectangle rect=new BetterRectangle(10,11,2,3);
        System.out.println("Area: "+rect.getArea()+"  Perimeter: "+rect.getPerimeter());
    }
}
