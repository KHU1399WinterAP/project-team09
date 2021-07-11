package main.java.gui.MainMenu;

import main.java.gui.SignupMenu.Signupmenuu;
import main.java.gui.LoginMenu.Loginmenu;


public class Mainmenu extends javax.swing.JFrame {

    public Mainmenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        pongLable = new javax.swing.JLabel();
        amazonLable = new javax.swing.JLabel();
        signupButton = new javax.swing.JButton();
        backLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("Login");
        loginButton.setContentAreaFilled(false);
        loginButton.setFocusPainted(false);
        loginButton.setFocusable(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        backPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 110, 25));

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(204, 0, 0));
        exitButton.setText("Exit");
        exitButton.setContentAreaFilled(false);
        exitButton.setFocusable(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        backPanel.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        pongLable.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        pongLable.setForeground(new java.awt.Color(255, 255, 255));
        pongLable.setText("Pong");
        backPanel.add(pongLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        amazonLable.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        amazonLable.setForeground(new java.awt.Color(0, 0, 0));
        amazonLable.setText("Powered By Amazon");
        backPanel.add(amazonLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        signupButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        signupButton.setForeground(new java.awt.Color(0, 0, 0));
        signupButton.setText("SignUp");
        signupButton.setContentAreaFilled(false);
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });
        backPanel.add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 25));

        backLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/rocket.png"))); // NOI18N
        backPanel.add(backLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {

        setVisible(false);
        Loginmenu login = new Loginmenu();
        login.setVisible(true);

    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        Signupmenuu sign = new Signupmenuu();
        sign.setVisible(true);
    }


    private javax.swing.JLabel backLable;
    private javax.swing.JPanel backPanel;
    private javax.swing.JLabel amazonLable;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel pongLable;
    private javax.swing.JButton signupButton;

}
