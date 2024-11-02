package ejemplo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI_panel extends JPanel {
    
    private Caballo caballo;
    private Caballo caballo2;
    private Caballo caballo3;
    
    private Semaforo semaforo;
    
    final int WIDHT = 500;
    final int HEIGHT = 500;
    
    private static GUI_panel panel;
    
    
    
    public static GUI_panel getInstancia() {
        if(panel == null){
            panel = new GUI_panel();
        }
        return panel;
    }
    
    public GUI_panel() {
        this.setPreferredSize(new Dimension(WIDHT, HEIGHT));
        caballo = new Caballo(this,1,100);
        caballo2 = new Caballo(this,1,220);
        caballo3 = new Caballo(this,1,340);
        
        //caballo.start();
        semaforo = new Semaforo();
        //semaforo.start();
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        caballo.dibujarCaballo(g);
        caballo2.dibujarCaballo(g);
        caballo3.dibujarCaballo(g);
        
        semaforo.dibujarSemaforo(g);
    }
    
    public void mover() {
        //System.out.println("FUNCIONANDO MOVER");
        for (int i = 0; i<40; i++) {
            //System.out.println("FUNCIONANDO WHILE");
            caballo.setXpos(caballo.getXpos() + caballo.getXvelocity());
            repaint();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    public void setColorRelleno(Color nuevoColor) {
        semaforo.setColorRelleno(nuevoColor);
        repaint();
    }
}
