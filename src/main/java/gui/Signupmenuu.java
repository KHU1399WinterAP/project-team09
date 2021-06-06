package main.java.gui;

import main.java.config.Databaseconfig;
import main.java.models.User;
import main.java.database.Database;
import main.java.app.Main;
import main.java.gui.*;

import java.awt.event.ActionEvent;
import java.util.Objects;

public class Signupmenuu extends javax.swing.JFrame {

    public Signupmenuu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userlable = new javax.swing.JLabel();
        passwordlable = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        passwordfield = new javax.swing.JPasswordField();
        Signupbutton = new javax.swing.JButton();
        menubutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 0, -1, -1));

        userlable.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        userlable.setForeground(new java.awt.Color(255, 255, 255));
        userlable.setText("UserName");
        getContentPane().add(userlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, 50));

        passwordlable.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        passwordlable.setForeground(new java.awt.Color(255, 255, 255));
        passwordlable.setText("Password");
        getContentPane().add(passwordlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 50));

        usernamefield.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        getContentPane().add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, 30));
        getContentPane().add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 150, 30));

        Signupbutton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        Signupbutton.setForeground(new java.awt.Color(255, 255, 255));
        Signupbutton.setText("Sign Up");
        Signupbutton.setContentAreaFilled(false);
        Signupbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupbuttonMouseClicked(evt);
            }
        });
        getContentPane().add(Signupbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 150, 50));

        menubutton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        menubutton.setForeground(new java.awt.Color(153, 0, 0));
        menubutton.setText("Back to menu");
        menubutton.setContentAreaFilled(false);
        menubutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menubuttonMouseClicked(evt);
            }
        });
        getContentPane().add(menubutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/gui/images/login-green.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menubuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubuttonMouseClicked

        setVisible(false);
        Mainmenu a = new Mainmenu();
        a.setVisible(true);

    }//GEN-LAST:event_menubuttonMouseClicked

    private void SignupbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupbuttonMouseClicked

        User user = new User(usernamefield.getText(), passwordfield.getPassword());
        System.out.println(user);

        Database.insertIntoUser(user);

        this.dispose();
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);


    }//GEN-LAST:event_SignupbuttonMouseClicked

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof User)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        User user = (User) object;
        return this.hashCode() == user.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passwordfield);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Signupmenuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signupmenuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signupmenuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signupmenuu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signupmenuu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Signupbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menubutton;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JLabel passwordlable;
    private javax.swing.JLabel userlable;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}
