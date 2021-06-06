package main.java.gui;

import java.awt.*;

public class Score extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;

    int player1;
    int player2;
    int rang;

    Score(int GAME_WIDTH, int GAME_HEIGHT) {

        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g) {

        if (rang == player1){
            g.setColor(Color.RED);
        }

        if (rang == player2){
            g.setColor(Color.YELLOW);
        }

        g.setFont(new Font("Consolas", Font.PLAIN, 60));
        g.drawString(player1 / 10 + String.valueOf(player1 % 10), (GAME_WIDTH / 2) - 500, 550);
        g.drawString(player2 / 10 + String.valueOf(player2 % 10), (GAME_WIDTH / 2) + 430, 50);

    }
}