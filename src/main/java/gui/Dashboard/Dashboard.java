package main.java.gui.Dashboard;

import main.java.gui.Dashboard.Setting.Setting;

import java.io.IOException;

import main.java.gui.MainMenu.Mainmenu;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        pongButton = new javax.swing.JButton();
        multiButton = new javax.swing.JButton();
        settingButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        maarButton = new javax.swing.JButton();
        backLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pongButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        pongButton.setForeground(new java.awt.Color(0, 0, 0));
        pongButton.setText("Pong");
        pongButton.setContentAreaFilled(false);
        pongButton.setDefaultCapable(false);
        pongButton.setFocusPainted(false);
        pongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pongButtonActionPerformed(evt);
            }
        });
        backPanel.add(pongButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 45));

        multiButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        multiButton.setForeground(new java.awt.Color(0, 0, 0));
        multiButton.setText("Multi Player");
        multiButton.setContentAreaFilled(false);
        multiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        multiButton.setFocusable(false);
        backPanel.add(multiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 45));

        settingButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        settingButton.setForeground(new java.awt.Color(0, 0, 0));
        settingButton.setText("Setting");
        settingButton.setContentAreaFilled(false);
        settingButton.setFocusable(false);
        settingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingButtonActionPerformed(evt);
            }
        });
        backPanel.add(settingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 150, 45));

        exitButton.setBackground(new java.awt.Color(204, 255, 204));
        exitButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(153, 0, 0));
        exitButton.setText("Exit");
        exitButton.setContentAreaFilled(false);
        exitButton.setFocusable(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        backPanel.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 100, 30));

        maarButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        maarButton.setForeground(new java.awt.Color(0, 0, 0));
        maarButton.setText("Maar");
        maarButton.setContentAreaFilled(false);
        maarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maarButtonActionPerformed(evt);
            }
        });
        backPanel.add(maarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 150, 45));

        backLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/rocket.png"))); // NOI18N
        backPanel.add(backLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settingButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        Setting s = new Setting();
        s.setVisible(true);
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        Mainmenu a = new Mainmenu();
        a.setVisible(true);
    }

    private void pongButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            FrameOfPong fop = new FrameOfPong();
            fop.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void maarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        FrameOfMaar fom = new FrameOfMaar();
        fom.setVisible(true);
    }

    private javax.swing.JLabel backLable;
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton maarButton;
    private javax.swing.JButton multiButton;
    private javax.swing.JButton pongButton;
    private javax.swing.JButton settingButton;

}
