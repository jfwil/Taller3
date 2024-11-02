/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

import javax.swing.JFrame;

/**
 *
 * @author asfak
 */
public class MyFrame extends JFrame {
    
    //public GUI_panel panel;
    
    public MyFrame(){
    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("NIGGA");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //this.setSize(500, 500);
        
        GUI_panel panel = new GUI_panel();
        this.add(panel);
        
        this.setVisible(true);
        this.pack();
        
        Caballo hilo = new Caballo(panel);
        hilo.start();
        
        
        
        
    }
    
}
