package main.java.gui.Dashboard;

import  java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.*;
import javax.swing.*;

public class PanelOfPong extends JPanel implements Runnable{

    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int)(GAME_WIDTH * (0.5555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH,GAME_HEIGHT);
    static final int TOOP_DIAMETER = 50;
    static final int RACKET_WIDTH = 15;
    static final int RACKET_HEIGHT = 80;

    Thread gameThread;

    Image image;

    Graphics graphics;

    Random random;

    Racket racket1;
    Racket racket2;

    Toop toop;

    Score score;



    PanelOfPong() throws IOException {

        newRackets();

        newBall();

        score = new Score(GAME_WIDTH,GAME_HEIGHT);

        this.setFocusable(true);
        this.addKeyListener(new AL());
        this.setPreferredSize(SCREEN_SIZE);
        this.setLayout(null);

        gameThread = new Thread(this);

        gameThread.start();
    }

    public void newBall() throws IOException {

        random = new Random();

        toop = new Toop((GAME_WIDTH/2)-(TOOP_DIAMETER/2),random.nextInt(GAME_HEIGHT-TOOP_DIAMETER),TOOP_DIAMETER,TOOP_DIAMETER);
    }

    public void newRackets() {

        racket1 = new Racket(0,(GAME_HEIGHT/2)-(RACKET_HEIGHT/2),RACKET_WIDTH,RACKET_HEIGHT,1);
        racket2 = new Racket(GAME_WIDTH-RACKET_WIDTH,(GAME_HEIGHT/2)-(RACKET_HEIGHT/2),RACKET_WIDTH,RACKET_HEIGHT,2);

    }

    public void paint(Graphics g) {

        image = createImage(getWidth(),getHeight());
        graphics = image.getGraphics();

        draw(graphics);

        g.drawImage(image,0,0,this);
    }

    public void draw(Graphics g) {

        racket1.draw(g);
        racket2.draw(g);

        toop.draw(g);


        score.draw(g);

        Toolkit.getDefaultToolkit().sync();
    }

    public void harkat() {

        racket1.harkat();
        racket2.harkat();

        toop.harkat();
    }

    public void collision() throws IOException {

        if(toop.y <=0) {

            toop.setYDirection(-toop.yVelocity);
        }

        if(toop.y >= GAME_HEIGHT-TOOP_DIAMETER) {

            toop.setYDirection(-toop.yVelocity);
        }



        if(toop.intersects(racket1)) {

            toop.xVelocity = Math.abs(toop.xVelocity);
            toop.xVelocity++;

            if(toop.yVelocity>0)
                toop.yVelocity++;
            else
                toop.yVelocity--;

            toop.setXDirection(toop.xVelocity);
            toop.setYDirection(toop.yVelocity);
        }

        if(toop.intersects(racket2)) {

            toop.xVelocity = Math.abs(toop.xVelocity);
            toop.xVelocity++;

            if(toop.yVelocity>0)
                toop.yVelocity++;
            else
                toop.yVelocity--;

            toop.setXDirection(-toop.xVelocity);
            toop.setYDirection(toop.yVelocity);
        }

        if(racket1.y<=0)
            racket1.y=0;

        if(racket1.y >= (GAME_HEIGHT-RACKET_HEIGHT))
            racket1.y = GAME_HEIGHT-RACKET_HEIGHT;

        if(racket2.y<=0)
            racket2.y=0;

        if(racket2.y >= (GAME_HEIGHT-RACKET_HEIGHT))
            racket2.y = GAME_HEIGHT-RACKET_HEIGHT;

        if(toop.x <=0) {

            score.player2++;

            newRackets();

            newBall();


        }

        if(toop.x >= GAME_WIDTH-TOOP_DIAMETER) {

            score.player1++;

            newRackets();

            newBall();

        }
    }

    public void run() {

        long lastTime = System.nanoTime();

        double amountOfTicks =60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;

        while(true) {

            long now = System.nanoTime();

            delta += (now -lastTime)/ns;

            lastTime = now;

            if(delta >=1) {

                harkat();

                try {
                    collision();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                repaint();

                delta--;
            }
        }
    }

    public class AL extends KeyAdapter{

        public void keyPressed(KeyEvent e) {

            racket1.keyPressed(e);
            racket2.keyPressed(e);
        }

        public void keyReleased(KeyEvent e) {

            racket1.keyReleased(e);
            racket2.keyReleased(e);
        }
    }
}