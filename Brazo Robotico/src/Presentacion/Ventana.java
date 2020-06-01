package Presentacion;

import Logica.Base;
import Logica.Seccion;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana(Base plataforma, Seccion s1, Seccion s2, Seccion s3, Seccion sGD1, Seccion sGI1, Seccion sGD2, Seccion sGI2, int ancho, int alto){
        //System.out.println(brazo.plataforma.getMovHorizontal());
        this.setTitle("Brazo Robotico");
        HojaDibujo dibujar=new HojaDibujo(plataforma,  s1,  s2,  s3,  sGD1,  sGI1,  sGD2,  sGI2);
        dibujar.setBounds(0,0,ancho,alto);
        add(dibujar);
        dibujar.Restriccion();
        
    }
/*
    @Override
    public void paint(Graphics g){
        Dimension dimension = this.getSize();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondo_pantalla.png"));
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        super.paint(g);
    }
*/
}
