package ejemplo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GUI_panel extends JPanel {

    final int WIDHT = 500;
    final int HEIGHT = 500;

    Image image;
    //Timer timer;
    int xvelocity = 10;

    int x = 1, y = 1;

    public GUI_panel() {
        this.setPreferredSize(new Dimension(WIDHT, HEIGHT));
        image = new ImageIcon("C:/Users/asfak/Documents/NetBeansProjects/Ejemplo/src/main/java/ejemplo/caballo.png").getImage();

        //timer = new Timer(100,this);
        //timer.restart();
    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics graphic_2d = (Graphics2D) g;

        graphic_2d.drawImage(image, x, y, null);
    }

    public void mover() {
        JOptionPane.showMessageDialog(null, "FUNCIONANDO MOVER");
        while (true) {
            x = x + xvelocity;
            repaint();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //@Override
        //public void actionPerformed(ActionEvent e) {
        // x = x+xvelocity;
        // repaint();
        //}

    }
}
