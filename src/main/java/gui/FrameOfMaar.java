package main.java.gui;

import javax.swing.JFrame;

public class FrameOfMaar extends JFrame{

    FrameOfMaar(){

        this.add(new PanelOfMaar());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

}