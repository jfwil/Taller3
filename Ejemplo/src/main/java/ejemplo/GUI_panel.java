package ejemplo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ejemplo.Semaforo;

public class GUI_panel extends JPanel {

    private Caballo caballo;
    private Caballo caballo2;
    private Caballo caballo3;

    private Controlador controlador;

    Semaforo semaforo = Semaforo.getInstancia();

    final int WIDHT = 500;
    final int HEIGHT = 500;

    private static GUI_panel panel;

    private JButton startButton;

    public static GUI_panel getInstancia() {
        if (panel == null) {
            panel = new GUI_panel();
        }
        return panel;
    }

    public GUI_panel() {

        this.setPreferredSize(new Dimension(WIDHT, HEIGHT));
        setLayout(new BorderLayout());
        caballo = new Caballo(this, 1, 100);
        caballo2 = new Caballo(this, 1, 220);
        caballo3 = new Caballo(this, 1, 340);

        semaforo = new Semaforo();
        controlador = new Controlador();

        startButton = new JButton("Iniciar Movimiento");
        startButton.addActionListener(e -> IniciarMovimiento());
        add(startButton, BorderLayout.NORTH);
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
        for (int i = 0; i < 40; i++) {
            //System.out.println("FUNCIONANDO WHILE");
            caballo.setXpos(caballo.getXpos() + caballo.getXvelocity());
            caballo2.setXpos(caballo2.getXpos() + caballo2.getXvelocity());
            caballo3.setXpos(caballo3.getXpos() + caballo3.getXvelocity());
            repaint();

            try {
                int numeroAleatorio = (int) (Math.random() * 100 + 2000);
                Thread.sleep(numeroAleatorio);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void setColorRelleno(Color nuevoColor) {
        semaforo.setColorRelleno(nuevoColor);
        repaint();
    }

    public void IniciarMovimiento() {
        semaforo.start();  

        new Thread(() -> {
            while (!controlador.Carerra(semaforo)) {
                try {
                    Thread.sleep(100);  
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
            caballo.start();
            caballo2.start();
            caballo3.start();
        }).start();
    }
}
