 import java.awt.event.MouseListener;
 import java.awt.event.MouseEvent;
 import javax.swing.JPanel;
 import javax.swing.JButton;
 import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

/**
 * Write a description of class DrawingEditorFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private JButton button1;    
    private JPanel panel;
    private JButton button2;
    private JButton button3;
    private DrawingPanel canvas;

    /**
     * Default constructor for objects of class DrawingEditorFrame
     */
    public ControlPanel(DrawingPanel canvas1)
    {
        canvas=canvas1;
        panel=new JPanel();
        button1=new JButton("Pick Color");
        panel.setBackground(Color.BLACK);
        button2=new JButton("Add Circle");
        button3=new JButton("Add Square");              
        
        ClickListener listener = new ClickListener();
        button1.addActionListener(listener);
        ClickListener listener2 = new ClickListener();
        button2.addActionListener(listener2);
        ClickListener listener3 = new ClickListener();
        button3.addActionListener(listener3);
        add(canvas);
        add(button1);
        add(panel);
        add(button2);
        add(button3);
    }
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {        
            String identity=event.getActionCommand();
            if (identity.equals("Pick Color"))
            {
                canvas.pickColor();
                panel.setBackground(canvas.getColor());
            }
            else if (identity.equals("Add Circle"))
            {
                canvas.addCircle();
            }
            else if (identity.equals("Add Square"))
            {
                canvas.addSquare();
            }
            else
            {
                System.out.println("UH OH");
            }
        }
    }
}
