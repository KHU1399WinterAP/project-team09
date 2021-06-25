package main.java.gui.SignupMenu;


import main.java.gui.Dashboard.Dashboard;
import main.java.models.User;
import main.java.database.Database;
import main.java.gui.MainMenu.Mainmenu;


public class Signupmenuu extends javax.swing.JFrame {

    public Signupmenuu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        userLable = new javax.swing.JLabel();
        passwordLable = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        signupButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        backLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 0, -1, -1));

        userLable.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        userLable.setForeground(new java.awt.Color(255, 255, 255));
        userLable.setText("UserName");
        getContentPane().add(userLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, 50));

        passwordLable.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        passwordLable.setForeground(new java.awt.Color(255, 255, 255));
        passwordLable.setText("Password");
        getContentPane().add(passwordLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 50));

        usernameField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, 30));
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 150, 30));

        signupButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setText("Sign Up");
        signupButton.setContentAreaFilled(false);
        signupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupButtonMouseClicked(evt);
            }
        });
        getContentPane().add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 150, 50));

        menuButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        menuButton.setForeground(new java.awt.Color(153, 0, 0));
        menuButton.setText("Back to menu");
        menuButton.setContentAreaFilled(false);
        menuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButtonMouseClicked(evt);
            }
        });
        getContentPane().add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 150, 50));

        backLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/login-green.jpg"))); // NOI18N
        getContentPane().add(backLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonMouseClicked(java.awt.event.MouseEvent evt) {

        setVisible(false);
        Mainmenu a = new Mainmenu();
        a.setVisible(true);

    }

    private void signupButtonMouseClicked(java.awt.event.MouseEvent evt) {

        User user = new User(usernameField.getText(), passwordField.getPassword());
        System.out.println(user);

        Database.insertIntoUser(user);

        this.dispose();
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);


    }


    private javax.swing.JLabel backLable;
    private javax.swing.JPanel backPanel;
    private javax.swing.JButton menuButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLable;
    private javax.swing.JButton signupButton;
    private javax.swing.JLabel userLable;
    private javax.swing.JTextField usernameField;

}
