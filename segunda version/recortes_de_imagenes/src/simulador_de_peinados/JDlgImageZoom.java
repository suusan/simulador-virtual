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
import javax.swing.Icon;
import javax.swing.JButton;

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
        jbtnMaximize1 = new javax.swing.JButton();
        jbtnMinimize1 = new javax.swing.JButton();
        jbtnMaximize2 = new javax.swing.JButton();
        jbtnMinimize2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnMinimize.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnMinimize.setText("-");
        jbtnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinimizeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 66, 50));

        jbtnMaximize.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnMaximize.setText("+");
        jbtnMaximize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMaximizeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMaximize, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 67, 50));

        jtxtZoom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtZoom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtZoom.setText("jTextField1");
        jPanel1.add(jtxtZoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 131, -1));

        jbtnMaximize1.setBackground(new java.awt.Color(255, 255, 153));
        jbtnMaximize1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnMaximize1.setText("->");
        jbtnMaximize1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMaximize1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMaximize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 67, 45));

        jbtnMinimize1.setBackground(new java.awt.Color(255, 255, 153));
        jbtnMinimize1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnMinimize1.setText("<-");
        jbtnMinimize1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinimize1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMinimize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 66, 43));

        jbtnMaximize2.setBackground(new java.awt.Color(255, 255, 153));
        jbtnMaximize2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnMaximize2.setText("^");
        jbtnMaximize2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMaximize2ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMaximize2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 67, 45));

        jbtnMinimize2.setBackground(new java.awt.Color(255, 255, 153));
        jbtnMinimize2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnMinimize2.setText("v");
        jbtnMinimize2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinimize2ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMinimize2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 66, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecortesImg/cabello1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 40, 200, 210));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecortesImg/cabello3.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 189, 210));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecortesImg/cabello2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 40, 190, 210));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecortesImg/cabello4.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, 200));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecortesImg/cabello5.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 189, 200));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecortesImg/cabello 7.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 189, 200));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecortesImg/cabello3.png"))); // NOI18N
        lblImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImagenMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnMaximizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMaximizeActionPerformed
    
       double valor =PanelZoom.getZoom(); 
       PanelZoom.setZoom(valor+1); 
       this.jtxtZoom.setText(String.valueOf(PanelZoom.getZoom())+ " %");
        
    }//GEN-LAST:event_jbtnMaximizeActionPerformed

    private void jbtnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinimizeActionPerformed
       double valor =PanelZoom.getZoom(); 
       if (valor > 20){
           PanelZoom.setZoom(valor - 1); 
           this.jtxtZoom.setText(String.valueOf(PanelZoom.getZoom())+ " %");
       }
    }//GEN-LAST:event_jbtnMinimizeActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        
        this.jPanel1.setSize(this.getWidth(), this.getHeight());
    }//GEN-LAST:event_formComponentResized

    private void lblImagenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblImagenMousePressed

    private void jbtnMaximize1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMaximize1ActionPerformed
        // TODO add your handling code here:
        this.lblImagen.setLocation(this.lblImagen.getX()+5,this.lblImagen.getY());
    }//GEN-LAST:event_jbtnMaximize1ActionPerformed

    private void jbtnMinimize1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinimize1ActionPerformed
        // TODO add your handling code here:
        this.lblImagen.setLocation(this.lblImagen.getX()-5,this.lblImagen.getY());
    }//GEN-LAST:event_jbtnMinimize1ActionPerformed

    private void jbtnMaximize2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMaximize2ActionPerformed
        // TODO add your handling code here:
        this.lblImagen.setLocation(this.lblImagen.getX(),this.lblImagen.getY()+-5);
    }//GEN-LAST:event_jbtnMaximize2ActionPerformed

    private void jbtnMinimize2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinimize2ActionPerformed
        // TODO add your handling code here:
        this.lblImagen.setLocation(this.lblImagen.getX(),this.lblImagen.getY()+5);
    }//GEN-LAST:event_jbtnMinimize2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        cambiarFondo(this.jButton3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cambiarFondo(this.jButton1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cambiarFondo(this.jButton2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        cambiarFondo(this.jButton4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        cambiarFondo(this.jButton5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        cambiarFondo(this.jButton6);
    }//GEN-LAST:event_jButton6ActionPerformed
    public void cambiarFondo(JButton B)
    {
        // TODO add your handling code here:
        this.lblImagen.setIcon(B.getIcon());
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnMaximize;
    private javax.swing.JButton jbtnMaximize1;
    private javax.swing.JButton jbtnMaximize2;
    private javax.swing.JButton jbtnMinimize;
    private javax.swing.JButton jbtnMinimize1;
    private javax.swing.JButton jbtnMinimize2;
    private javax.swing.JTextField jtxtZoom;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables
}
