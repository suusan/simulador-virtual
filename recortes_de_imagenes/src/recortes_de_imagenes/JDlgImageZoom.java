/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recortes_de_imagenes;

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
public class JDlgImageZoom extends javax.swing.JDialog {
      JPanelZoom PanelZoom;
    public JDlgImageZoom(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        this.setResizable(true);
        JPanelZoom f = new JPanelZoom();
        f.setBounds(0, 0,200,200);
        f.setSize(100, 100);
        f.setVisible(true);
        this.getContentPane().add(f);
        PanelZoom = f;
        this.jtxtZoom.setText(String.valueOf(PanelZoom.getZoom())+ " %");
    }
    public void setImagen(Image img) {
        PanelZoom.setImagen(img);
       this.jtxtZoom.setText(String.valueOf(PanelZoom.getZoom())+ " %");
      
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnMinimize = new javax.swing.JButton();
        jbtnMaximize = new javax.swing.JButton();
        jtxtZoom = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jbtnMinimize.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnMinimize.setText("-");
        jbtnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinimizeActionPerformed(evt);
            }
        });

        jbtnMaximize.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnMaximize.setText("+");
        jbtnMaximize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMaximizeActionPerformed(evt);
            }
        });

        jtxtZoom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtZoom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtZoom.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnMaximize, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtZoom, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtnMaximize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jbtnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jtxtZoom)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnMaximizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMaximizeActionPerformed
    
       double valor =PanelZoom.getZoom(); 
       PanelZoom.setZoom(valor+10); 
       this.jtxtZoom.setText(String.valueOf(PanelZoom.getZoom())+ " %");
        
    }//GEN-LAST:event_jbtnMaximizeActionPerformed


    private void jbtnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinimizeActionPerformed
       double valor =PanelZoom.getZoom(); 
       if (valor > 20){
           PanelZoom.setZoom(valor - 10); 
           this.jtxtZoom.setText(String.valueOf(PanelZoom.getZoom())+ " %");
       }
    }//GEN-LAST:event_jbtnMinimizeActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        
        this.jPanel1.setSize(this.getWidth(), this.getHeight());
    }//GEN-LAST:event_formComponentResized

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDlgImageZoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgImageZoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgImageZoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgImageZoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgImageZoom dialog = new JDlgImageZoom(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnMaximize;
    private javax.swing.JButton jbtnMinimize;
    private javax.swing.JTextField jtxtZoom;
    // End of variables declaration//GEN-END:variables
}
