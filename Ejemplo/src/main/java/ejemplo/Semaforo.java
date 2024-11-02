package ejemplo;

import java.awt.Color;
import static java.awt.Color.RED;
import static java.awt.Color.green;
import static java.awt.Color.yellow;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author asfak
 */
public class Semaforo extends Thread {
    
    private Color colorRelleno = RED;
    
    
    
    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "Hilo Semaforo Corriendo");
        
        
        try {
            int numeroAleatorio = (int) (Math.random() * 2000 + 4000);
            Thread.sleep(numeroAleatorio);

        } catch (InterruptedException ex) {
            Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
        }
        cambiarColorBola(yellow);
        
        try {
            int numeroAleatorio = (int) (Math.random() * 2000 + 4000);
            Thread.sleep(numeroAleatorio);
        } catch (InterruptedException ex) {
            Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
        }
        cambiarColorBola(green);
        //JOptionPane.showMessageDialog(null, "verde");

    }
     public void cambiarColorBola(Color color) {
        GUI_panel.getInstancia().setColorRelleno(color);
    }
    public void dibujarSemaforo(Graphics g){
    
        g.setColor(colorRelleno);
        g.fillOval(0, 0, 100, 100);
        g.setColor(Color.BLACK);
        g.drawOval(0,0,100,100);  
        
    }
     
     
    public Color getColorRelleno() {
        return colorRelleno;
    }
    public void setColorRelleno(Color colorRelleno) {
        this.colorRelleno = colorRelleno;
    }
    
}