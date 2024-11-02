/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

import javax.swing.JPanel;

/**
 *
 * @author asfak
 */
public class Caballo extends Thread{
    
    public GUI_panel panel;
    
    public Caballo(GUI_panel panel){
    
        this.panel = panel;
        
    }
    
    public void run(){
        panel.mover();
    }
}
