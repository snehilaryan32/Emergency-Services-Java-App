/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package citizenApp;

import crimepatrolfinalproject.Login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aryan
 */
public class CitizenMenu extends javax.swing.JFrame {

    /**
     * Creates new form CitizenMenu
     */
    public CitizenMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLogOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jViewNearbyCases = new javax.swing.JButton();
        jCitizenPersonalDetailsButton = new javax.swing.JButton();
        jViewLawyers = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Citizen Menu");

        jLogOut.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLogOut.setForeground(new java.awt.Color(255, 102, 0));
        jLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon2/cross.png"))); // NOI18N
        jLogOut.setText("Log Out");
        jLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLogOut)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLogOut)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jViewNearbyCases.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jViewNearbyCases.setForeground(new java.awt.Color(255, 102, 0));
        jViewNearbyCases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon2/map (1).png"))); // NOI18N
        jViewNearbyCases.setText("View Nearby Case");
        jViewNearbyCases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jViewNearbyCasesMouseClicked(evt);
            }
        });
        jViewNearbyCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewNearbyCasesActionPerformed(evt);
            }
        });

        jCitizenPersonalDetailsButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jCitizenPersonalDetailsButton.setForeground(new java.awt.Color(255, 102, 0));
        jCitizenPersonalDetailsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon2/updatepatient.png"))); // NOI18N
        jCitizenPersonalDetailsButton.setText("Update Personal Details");
        jCitizenPersonalDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCitizenPersonalDetailsButtonMouseClicked(evt);
            }
        });
        jCitizenPersonalDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCitizenPersonalDetailsButtonActionPerformed(evt);
            }
        });

        jViewLawyers.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jViewLawyers.setForeground(new java.awt.Color(255, 102, 0));
        jViewLawyers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon2/lawyer.png"))); // NOI18N
        jViewLawyers.setText("View Lawyers");
        jViewLawyers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jViewLawyersMouseClicked(evt);
            }
        });
        jViewLawyers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewLawyersActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 102, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon2/111siren.png"))); // NOI18N
        jButton4.setText("View Emergency Resources");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jViewNearbyCases, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jViewLawyers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(105, 105, 105)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCitizenPersonalDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                .addGap(218, 218, 218))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jViewNearbyCases)
                    .addComponent(jCitizenPersonalDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jViewLawyers, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jViewNearbyCasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jViewNearbyCasesMouseClicked
        // TODO add your handling code here:
        ViewNearbyCase cManagement = new ViewNearbyCase();
        cManagement.setVisible(true);
        dispose();
    }//GEN-LAST:event_jViewNearbyCasesMouseClicked

    private void jViewLawyersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jViewLawyersMouseClicked
        // TODO add your handling code here:
        ViewLawyers cManagement = null;
        try {
            cManagement = new ViewLawyers();
        } catch (InstantiationException ex) {
            Logger.getLogger(CitizenMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        cManagement.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jViewLawyersMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        try {
            // TODO add your handling code here:
            ViewEmergencyResources cManagement = new ViewEmergencyResources();
            cManagement.setVisible(true);
            dispose();
        } catch (InstantiationException ex) {
            Logger.getLogger(CitizenMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CitizenMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jCitizenPersonalDetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCitizenPersonalDetailsButtonMouseClicked
        // TODO add your handling code here:
        UpdatePersonalDetails cManagement = new UpdatePersonalDetails();
        cManagement.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jCitizenPersonalDetailsButtonMouseClicked

    private void jViewNearbyCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewNearbyCasesActionPerformed
        ViewNearbyCase obj = new ViewNearbyCase(); 
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jViewNearbyCasesActionPerformed

    private void jCitizenPersonalDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCitizenPersonalDetailsButtonActionPerformed
        UpdatePersonalDetails obj = new UpdatePersonalDetails(); 
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jCitizenPersonalDetailsButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogOutActionPerformed
        Login obj = new Login(); 
        obj.setVisible(true); 
        dispose();    
    }//GEN-LAST:event_jLogOutActionPerformed

    private void jViewLawyersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewLawyersActionPerformed
            ViewLawyers obj = null; 
        try {
            obj = new ViewLawyers();
        } catch (InstantiationException ex) {
            Logger.getLogger(CitizenMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_jViewLawyersActionPerformed

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
            java.util.logging.Logger.getLogger(CitizenMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CitizenMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CitizenMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CitizenMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CitizenMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jCitizenPersonalDetailsButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jLogOut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jViewLawyers;
    private javax.swing.JButton jViewNearbyCases;
    // End of variables declaration//GEN-END:variables
}
