package main.java.gui.LoginMenu;


import main.java.gui.Dashboard.Dashboard;
import main.java.models.User;
import main.java.database.Database;

import main.java.gui.MainMenu.Mainmenu;


public class Loginmenu extends javax.swing.JFrame {

    public Loginmenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        passwordLable = new javax.swing.JLabel();
        userLable = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        backLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, -1));

        passwordLable.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        passwordLable.setForeground(new java.awt.Color(255, 255, 255));
        passwordLable.setText("Password");
        getContentPane().add(passwordLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, 50));

        userLable.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        userLable.setForeground(new java.awt.Color(255, 255, 255));
        userLable.setText("UserName");
        getContentPane().add(userLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, 50));

        usernameField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 30));
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, 30));

        loginButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setContentAreaFilled(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 150, 50));

        menuButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        menuButton.setForeground(new java.awt.Color(153, 0, 0));
        menuButton.setText("Back to menu");
        menuButton.setContentAreaFilled(false);
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 150, 50));

        backLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/login-green.jpg"))); // NOI18N
        getContentPane().add(backLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {

        this.dispose();
        Mainmenu a = new Mainmenu();
        a.setVisible(true);

    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {

        String username = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());

        if (!username.isBlank()) {
            User user = Database.getUserByUsername(username);

            if (user != null && user.password.equals(password)) {

                this.dispose();
                Dashboard l = new Dashboard();
                l.setVisible(true);
                return;
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLable;
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton menuButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLable;
    private javax.swing.JLabel userLable;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
