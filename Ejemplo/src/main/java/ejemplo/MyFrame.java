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
    
    GUI_panel panel1 = GUI_panel.getInstancia();
    
    public MyFrame(){
    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Carrera de caballos");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        
        this.add(panel1);
        
        
        this.setVisible(true);
        this.pack();
        
        
    
        
        
        
        
    }
    
}

