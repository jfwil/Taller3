/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

/**
 *
 * @author asfak
 */
public class Caballo extends Thread{
    
    public GUI_panel panel;
    
    public int x = 1;
    private int y = 50; 
    private int xvelocity = 10;
    
    Image image; //
    
    public Caballo(GUI_panel panel, int x, int y){
        this.x= x;
        this.y= y;
        this.panel = panel;
        image = new ImageIcon("C:/Users/asfak/Documents/NetBeansProjects/Ejemplo/src/main/java/ejemplo/caballo.png").getImage();
        
    }
    
    public void dibujarCaballo(Graphics g){  //
        
        Graphics graphic_2d = (Graphics2D) g;

        graphic_2d.drawImage(image, x, y, null);
        
    }
    
    @Override
    public void run(){
        //System.out.println("FUNCIONANDO RUN");
        panel.mover();
    }
    
    
    
    public int getXpos() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setXpos(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getXvelocity() {
        return xvelocity;
    }
        
}
