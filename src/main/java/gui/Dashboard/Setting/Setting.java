package main.java.gui.Dashboard.Setting;


import main.java.gui.Dashboard.Dashboard;

public class Setting extends javax.swing.JFrame {

    public Setting() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        colorButton = new javax.swing.JButton();
        resolutionButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        backLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        colorButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        colorButton.setText("Color");
        colorButton.setContentAreaFilled(false);
        colorButton.setFocusable(false);
        backPanel.add(colorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 140, 80));

        resolutionButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        resolutionButton.setText("Resolution");
        resolutionButton.setContentAreaFilled(false);
        resolutionButton.setFocusable(false);
        backPanel.add(resolutionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 140, 80));

        menuButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        menuButton.setText("Back To Main Menu");
        menuButton.setContentAreaFilled(false);
        menuButton.setFocusable(false);
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        backPanel.add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 240, 50));

        backLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/setting.jpg"))); // NOI18N
        backPanel.add(backLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

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

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        Dashboard d = new Dashboard();
        d.setVisible(true);
    }

    private javax.swing.JLabel backLable;
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton colorButton;
    private javax.swing.JButton menuButton;
    private javax.swing.JButton resolutionButton;

}
