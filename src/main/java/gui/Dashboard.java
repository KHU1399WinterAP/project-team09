package main.java.gui;

import main.java.gui.*;
import java.io.IOException;

public class Dashboard extends javax.swing.JFrame  {

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        PongButton = new javax.swing.JButton();
        MultiButton = new javax.swing.JButton();
        SettingButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        MaarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PongButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        PongButton.setForeground(new java.awt.Color(0, 0, 0));
        PongButton.setText("Pong");
        PongButton.setContentAreaFilled(false);
        PongButton.setDefaultCapable(false);
        PongButton.setFocusPainted(false);
        PongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PongButtonActionPerformed(evt);
            }
        });
        jPanel2.add(PongButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 45));

        MultiButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        MultiButton.setForeground(new java.awt.Color(0, 0, 0));
        MultiButton.setText("Multi Player");
        MultiButton.setContentAreaFilled(false);
        MultiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MultiButton.setFocusable(false);
        jPanel2.add(MultiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 45));

        SettingButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        SettingButton.setForeground(new java.awt.Color(0, 0, 0));
        SettingButton.setText("Setting");
        SettingButton.setContentAreaFilled(false);
        SettingButton.setFocusable(false);
        SettingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SettingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 150, 45));

        ExitButton.setBackground(new java.awt.Color(204, 255, 204));
        ExitButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(153, 0, 0));
        ExitButton.setText("Exit");
        ExitButton.setContentAreaFilled(false);
        ExitButton.setFocusable(false);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 100, 30));

        MaarButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        MaarButton.setForeground(new java.awt.Color(0, 0, 0));
        MaarButton.setText("Maar");
        MaarButton.setContentAreaFilled(false);
        MaarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(MaarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 150, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/gui/images/rocket.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SettingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingButtonActionPerformed
        this.dispose();
        Setting s = new Setting();
        s.setVisible(true);
    }//GEN-LAST:event_SettingButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
        Mainmenu a = new Mainmenu();
        a.setVisible(true);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void PongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PongButtonActionPerformed
        try {
   FrameOfPong fop = new FrameOfPong();
   fop.setVisible(true);
} catch (IOException e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_PongButtonActionPerformed

    private void MaarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaarButtonActionPerformed
       FrameOfMaar fom = new FrameOfMaar();
       fom.setVisible(true);
    }//GEN-LAST:event_MaarButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton MaarButton;
    private javax.swing.JButton MultiButton;
    private javax.swing.JButton PongButton;
    private javax.swing.JButton SettingButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
