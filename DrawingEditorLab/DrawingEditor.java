 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import java.awt.Rectangle;
 //import java.awt.geom.Line2D;
 import javax.swing.JFrame;
 import java.awt.Dimension;

/**
 * Write a description of class DrawingEditorComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    private DrawingPanel canvas;
    private ControlPanel controls;

    public DrawingEditor()
    {
        canvas=new DrawingPanel();
        controls=new ControlPanel(canvas);
        add(controls);       
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main()
    {
        DrawingEditor start=new DrawingEditor();
    }
}
