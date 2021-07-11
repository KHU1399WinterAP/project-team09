package main.java.gui.Dashboard;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;

public class Toop extends Rectangle{

    private BufferedImage image;

    Random random;

    int xVelocity;
    int yVelocity;
    int initialSpeed = 2;

    Toop(int x, int y, int width, int height) throws IOException {
        super(x,y,width,height);

        random = new Random();

        int randomXDirection = random.nextInt(2);

        if(randomXDirection == 0)

            randomXDirection--;

        setXDirection(randomXDirection*initialSpeed);

        int randomYDirection = random.nextInt(2);

        if(randomYDirection == 0)

            randomYDirection--;

        setYDirection(randomYDirection*initialSpeed);
try {
    image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/main/resources/images/Ball.png")));
} catch (IOException e) {
    e.printStackTrace();
}
    }

    public void setXDirection(int randomXDirection) {

        xVelocity = randomXDirection;
    }

    public void setYDirection(int randomYDirection) {

        yVelocity = randomYDirection;
    }

    public void harkat() {

        x += xVelocity;
        y += yVelocity;
    }


    public void draw(Graphics g) {

        g.drawImage(image, x, y, null);
    }
}


