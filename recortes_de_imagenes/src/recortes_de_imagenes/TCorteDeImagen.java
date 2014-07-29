/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recortes_de_imagenes;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author SUSAN
 */
public class TCorteDeImagen {
    
    public float x=0;
    public float y=0;
    public float ancho=0;
    public float alto=0;
    public Image imgOriginal;
    public Image imgCortada;
    private boolean cortada=true;

    public boolean isCortada() {
        return cortada;
    }
    
    
    public void CortarImagen(){
      if (ancho>5 && alto>5) {
          
           this.imgCortada = ((BufferedImage) imgOriginal).getSubimage((int)x,(int) y,(int) ancho,(int) alto) ;
        }
     else{
           int _ancho = ((BufferedImage) imgOriginal).getWidth();
           int _alto = ((BufferedImage) imgOriginal).getHeight();
           imgCortada = ((BufferedImage) imgOriginal).getSubimage(0,0, _ancho,_alto) ;
        }
       this.cortada = true;
    }
    public void Reset(){
           this.ancho = ((BufferedImage) imgOriginal).getWidth();
           this.alto = ((BufferedImage) imgOriginal).getHeight();
           this.x = 0;
           this.y=0;
           imgCortada = ((BufferedImage) imgOriginal).getSubimage(0,0, (int)this.ancho,(int)this.alto) ;
           this.cortada = true;
    }
    public Image getImgOriginal() {
        return imgOriginal;
    }

    public void setImgOriginal(Image imgOriginal) {
        this.imgOriginal = imgOriginal;
        Reset();
    }

    public Image getImgCortada() {
        return imgCortada;
    }

    public void setImgCortada(Image imgCortada) {
        this.imgCortada = imgCortada;
    }
    public void setDimension(float x, float y, float width, float height){
        this.x = x;
        this.y = y;
        this.ancho = width;
        this.alto = height;
        this.cortada = false;
    }
    public int getCorteWidth(){
        if (this.imgOriginal != null) {
            return ((BufferedImage) this.imgOriginal).getWidth();
        }
        else {
            return 0;
        }
    }
    public int getCorteHeight(){
        if (this.imgOriginal != null) {
            return ((BufferedImage) this.imgOriginal).getHeight();
        }
        else {
            return 0;
        }
    }
    public int getX(){ return (int) this.x;}
    public int getY(){ return (int) this.y;}
}
