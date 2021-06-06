package main.java.gui;

import main.java.config.Databaseconfig;
import main.java.models.User;
import main.java.database.Database;
import main.java.app.Main;
import main.java.gui.*;

import java.awt.event.ActionEvent;

public class Loginmenuu extends javax.swing.JFrame {

    public Loginmenuu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PasswordLable = new javax.swing.JLabel();
        UserLable = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        passwordfield = new javax.swing.JPasswordField();
        loginbutton = new javax.swing.JButton();
        menubutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, -1));

        PasswordLable.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        PasswordLable.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLable.setText("Password");
        getContentPane().add(PasswordLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, 50));

        UserLable.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        UserLable.setForeground(new java.awt.Color(255, 255, 255));
        UserLable.setText("UserName");
        getContentPane().add(UserLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, 50));

        usernamefield.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        getContentPane().add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 30));
        getContentPane().add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, 30));

        loginbutton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        loginbutton.setForeground(new java.awt.Color(255, 255, 255));
        loginbutton.setText("Login");
        loginbutton.setContentAreaFilled(false);
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 150, 50));

        menubutton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        menubutton.setForeground(new java.awt.Color(153, 0, 0));
        menubutton.setText("Back to menu");
        menubutton.setContentAreaFilled(false);
        menubutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubuttonActionPerformed(evt);
            }
        });
        getContentPane().add(menubutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/gui/images/login-green.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menubuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubuttonActionPerformed

        this.dispose();
        Mainmenu a = new Mainmenu();
        a.setVisible(true);

    }//GEN-LAST:event_menubuttonActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed

        String username = usernamefield.getText();
        String password = String.valueOf(passwordfield.getPassword());

        if (!username.isBlank()) {
            User user = Database.getUserByUsername(username);

            if (user != null && user.password.equals(password)) {

                this.dispose();
                Dashboard l = new Dashboard();
                l.setVisible(true);
                return;
            }
        }

    }//GEN-LAST:event_loginbuttonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loginmenuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginmenuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginmenuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginmenuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginmenuu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PasswordLable;
    private javax.swing.JLabel UserLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbutton;
    private javax.swing.JButton menubutton;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}
