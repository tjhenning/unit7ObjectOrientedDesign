import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.*;
//import java.awt.Graphics;


class ImagePanel extends JPanel {

    private Image img;


    public static void main(String[] args) {
    ImagePanel panel = new ImagePanel(new ImageIcon("sandwich.jpg").getImage(););

    }

    public ImagePanel(Image img) {
        this.img = img;
        Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
}