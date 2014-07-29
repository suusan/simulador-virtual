/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador_de_peinados;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author SUSAN
 */
public class JPanelZoom extends  javax.swing.JPanel{
     private Image img;
     private double fZoom=100;
     private double fFactorZoom=1;
    /**
     * Creates new form JPanelZoom
     */
    
    public void setImagen(Image img){
        this.img = img;
    }
    public JPanelZoom() {
       
    }
 
    public double getZoom() {
        return fZoom;
    }

    public void setZoom(double fZoom) {
        this.fZoom = fZoom;
        this.repaint();
    }
     
    
   @Override
    protected void paintComponent(Graphics g) {
        paintOriginal(g); 
    }
   private void paintOriginal(Graphics g) {         
      Graphics2D g2 = (Graphics2D)g;
      Graphics2D g2D;
      BufferedImage Imagmemoria;

      if(img!=null){
        double w = img.getWidth(this)* this.fZoom/100;
        double h = img.getHeight(this)* this.fZoom/100;
        Imagmemoria = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
        this.setSize(img.getWidth(this),img.getHeight(this));
        this.setSize((int) w, (int) h);
        g2D = Imagmemoria.createGraphics();
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.drawImage(img,0, 0, (int) w, (int)h, this);
        g2D.setStroke(new BasicStroke(2f));

        g2.drawImage(Imagmemoria, 0, 0, this);
      }
    }
}
