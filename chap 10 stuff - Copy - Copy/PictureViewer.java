import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;

public class PictureViewer
{
    private static final int FRAME_WIDTH=300;
    private static final int FRAME_HEIGHT=200;
    
    private JPanel panel;
    private JFrame frame;
    private JButton button;    
    //private JButton button2;   
    private JLabel label;
    
    
    public PictureViewer()
    {
        frame=new JFrame();
        panel=new JPanel();
        Image image = ImageIO.read(ImageIcon("sandwich.jpg").getImage());
        button = new JLabel(new ImageIcon(image));
        //button=new JButton("A");
      
        Dimension d=new Dimension(200,200);
        button.setPreferredSize(d);
        button.setVerticalAlignment(1);
        //button.setHorizontalTextPosition(200);
        panel.add(button);
        panel.add(button2);
        
        label=new JLabel("TEXT BOX");
        panel.add(label);
        
        ClickListener listener = new ClickListener();
        button.addActionListener(listener);
        ClickListener listener2 = new ClickListener();
        button2.addActionListener(listener2);
        
        frame.add(panel);
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT*2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main()
    {
        PictureViewer veiw=new PictureViewer();
    }   
    
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {        
            label.setText("Button "+event.getActionCommand()+" was clicked at");        
        }
    }
}
