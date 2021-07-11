package main.java.gui.Dashboard;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class PanelOfMaar extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 600;
    static final int SIZE_APPLE = 30;
    static final int DELAY = 175;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / (SIZE_APPLE * SIZE_APPLE);


    final int[] x = new int[GAME_UNITS];
    final int[] y = new int[GAME_UNITS];

    int partsOfSnake = 1;
    int applesEaten;
    int appleX;
    int appleY;

    char direction = 'R';

    boolean running = false;

    Timer timer;

    Random random;

    PanelOfMaar() {
        random = new Random();

        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.WHITE);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());

        startGame();
    }

    public void startGame() {
        newApple();

        running = true;

        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        draw(g);
    }

    public void draw(Graphics g) {

        if (running) {
            g.setColor(Color.RED);
            g.fillOval(appleX, appleY, SIZE_APPLE, SIZE_APPLE);

            for (int i = 0; i < partsOfSnake; i++) {
                if (i == 0) {
                    g.setColor(Color.ORANGE);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.drawOval(x[i], y[i], SIZE_APPLE, SIZE_APPLE);
            }

            g.setColor(Color.blue);
            g.setFont(new Font("Ink free", Font.BOLD, 30));

            FontMetrics metrics = getFontMetrics(g.getFont());

            g.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: " + applesEaten)) / 2, g.getFont().getSize());
        } else {
            payan(g);
        }
    }

    public void newApple() {

        appleX = random.nextInt(SCREEN_WIDTH / SIZE_APPLE) * SIZE_APPLE;
        appleY = random.nextInt(SCREEN_HEIGHT / SIZE_APPLE) * SIZE_APPLE;

    }

    public void harkat() {

        for (int i = partsOfSnake; i > 0; i--) {

            x[i] = x[i - 1];
            y[i] = y[i - 1];

        }


        switch (direction) {
            case 'U' -> y[0] = y[0] - SIZE_APPLE;
            case 'D' -> y[0] = y[0] + SIZE_APPLE;
            case 'L' -> x[0] = x[0] - SIZE_APPLE;
            case 'R' -> x[0] = x[0] + SIZE_APPLE;
        }
    }

    public void checkApp() {

        if ((x[0] == appleX) && (y[0] == appleY)) {

            partsOfSnake++;
            applesEaten++;

            newApple();
        }

    }

    public void collisions() {

        for (int i = partsOfSnake; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
                break;
            }

        }


        if (x[0] < 0) {
            running = false;
        }


        if (x[0] > SCREEN_WIDTH) {
            running = false;
        }


        if (y[0] < 0) {
            running = false;
        }


        if (y[0] > SCREEN_HEIGHT) {
            running = false;
        }


        if (!running) {
            timer.stop();
        }

    }

    public void payan(Graphics g) {

        g.setColor(Color.RED);
        g.setFont(new Font("Ink free", Font.BOLD, 80));

        FontMetrics metrics1 = getFontMetrics(g.getFont());

        g.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score: " + applesEaten)) / 2, g.getFont().getSize());
        g.setColor(Color.red);
        g.setFont(new Font("Ink free", Font.BOLD, 75));

        FontMetrics metrics2 = getFontMetrics(g.getFont());

        g.drawString("Game over", (SCREEN_WIDTH - metrics2.stringWidth("Game over")) / 2, SCREEN_HEIGHT / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {

            harkat();

            checkApp();

            collisions();

        }
        repaint();
    }


    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

            switch (e.getKeyCode()) {

                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;

                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;

                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;

                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }

        }

    }

}