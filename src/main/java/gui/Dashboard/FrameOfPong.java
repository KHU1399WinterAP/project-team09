package main.java.gui.Dashboard;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class FrameOfPong extends JFrame {

    PanelOfPong panel;

    FrameOfPong() throws IOException {

        panel = new PanelOfPong();

        this.add(panel);
        this.setTitle("Pong");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

    }
}
