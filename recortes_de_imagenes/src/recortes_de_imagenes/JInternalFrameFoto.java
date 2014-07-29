/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recortes_de_imagenes;

/**
 *
 * @author SUSAN
 */
public class JInternalFrameFoto extends javax.swing.JInternalFrame {

    
    public JInternalFrameFoto(String title) {
         super(title,true,true,true,true);
         initComponents();
    }
    public JInternalFrameFoto() {
         super("",true,true,true,true);
         initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
