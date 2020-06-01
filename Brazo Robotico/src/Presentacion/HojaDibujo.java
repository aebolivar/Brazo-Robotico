package Presentacion;

import Logica.Articulacion;
import Logica.Base;
import Logica.Seccion;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class HojaDibujo extends JLabel{
    
    public Base plataforma=new Base();
    public Base bas = new Base();
    public Articulacion a1=new Articulacion();
    public Seccion s1=new Seccion();
    public Articulacion a2=new Articulacion();
    public Seccion s2=new Seccion();
    public Articulacion a3=new Articulacion();
    public Seccion s3=new Seccion();
    public Articulacion aGD1=new Articulacion();
    public Articulacion aGI1=new Articulacion();
    public Seccion sGD1=new Seccion();
    public Seccion sGI1=new Seccion();
    public Articulacion aGD2=new Articulacion();
    public Articulacion aGI2=new Articulacion();
    public Seccion sGD2=new Seccion();
    public Seccion sGI2=new Seccion();
    
    public HojaDibujo(Base p, Seccion s1, Seccion s2, Seccion s3, Seccion sGD1, Seccion sGI1, Seccion sGD2, Seccion sGI2){
        
        
        this.plataforma=p;
        this.a1 = a1;
        this.s1 = s1;
        this.a2 = a2;
        this.s2 = s2;
        this.a3 = a3;
        this.s3 = s3; 
        this.aGD1 = aGD1; 
        this.aGI1 = aGI1;
        this.sGD1 = sGD1;
        this.sGI1 = sGI1;
        this.aGD2 = aGD2;
        this.aGI2 = aGI2;
        this.sGD2 = sGD2;
        this.sGI2 = sGI2;
           
    }
    
    public void Restriccion(){
        if(s1.getIx()<0 || s1.getFx() <0 || s2.getIx()<0 || s2.getFx() <0 || s3.getIx()<0 || s3.getFx() <0 || sGD1.getIx()<0 || sGD1.getFx() <0 || sGD2.getIx()<0 || sGD2.getFx() <0){
            JOptionPane.showMessageDialog(null, "Configuracion imposible");
        }
        
        if(s1.getIy()<0 || s1.getFy() <0 || s2.getIx()<0 || s2.getFy() <0 || s3.getIy()<0 || s3.getFy() <0 || sGD1.getIy()<0 || sGD1.getFy() <0 || sGD2.getIy()<0 || sGD2.getFy() <0){
            JOptionPane.showMessageDialog(null, "Configuracion imposible");
        }
        
        if(s1.getIx()>this.getWidth() || s1.getFx() >this.getWidth() || s2.getIx()>this.getWidth() || s2.getFx() >this.getWidth() || s3.getIx()>this.getWidth() || s3.getFx() >this.getWidth() || sGD1.getIx()>this.getWidth() || sGD1.getFx() >this.getWidth() || sGD2.getIx()>this.getWidth() || sGD2.getFx() >this.getWidth()){
            JOptionPane.showMessageDialog(null, "Configuracion imposible");
        }
        
        if(s1.getIy()>this.getHeight() || s1.getFy() >this.getHeight() || s2.getIx()>this.getHeight() || s2.getFy() >this.getHeight() || s3.getIy()>this.getHeight() || s3.getFy() >this.getHeight() || sGD1.getIy()>this.getHeight() || sGD1.getFy() >this.getHeight() || sGD2.getIy()>this.getHeight() || sGD2.getFy() >this.getHeight()){
            JOptionPane.showMessageDialog(null, "Configuracion imposible");
        }
    }
    
    public void paintComponent(Graphics g){
        
        
        super.paintComponent(g);
        
        g.drawRect(plataforma.getMovHorizontal(), plataforma.getInicialVer(), plataforma.getAncho(), plataforma.getAltura());
        g.drawLine(s1.getIx(), s1.getIy(), s1.getFx(), s1.getFy());
        g.drawLine(s2.getIx(), s2.getIy(), s2.getFx(), s2.getFy());
        g.drawLine(s3.getIx(), s3.getIy(), s3.getFx(), s3.getFy());
        g.drawLine(sGD1.getIx(), sGD1.getIy(), sGD1.getFx(), sGD1.getFy());
        g.drawLine(sGD2.getIx(), sGD2.getIy(), sGD2.getFx(), sGD2.getFy());
        g.drawLine(sGI1.getIx(), sGI1.getIy(), sGI1.getFx(), sGI1.getFy());
        g.drawLine(sGI2.getIx(), sGI2.getIy(), sGI2.getFx(), sGI2.getFy());
        
        
        
    }
    
    
    /*public void limiteExcedido() {
        JOptionPane.showMessageDialog(this, "¡ALERTA!, Ha excedido el limite del area", "Game Over", JOptionPane.YES_NO_OPTION);
	System.exit(ABORT);
    }
    public HojaDibujo() {
        initComponents();
    }
    */

    
    

}
