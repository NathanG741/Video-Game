package Main;

import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

import javax.imageio.ImageIO;
import javax.swing.*; //JFrame
import java.awt.*; //Graphics
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import static utilz.Constants.playerConstants.*;
import static utilz.Constants.Directions.*;

public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;
    private float xDelta = 100, yDelta = 100;
    private BufferedImage img;
    private BufferedImage background;
    private BufferedImage[][] animations;
    private int aniTick, aniIndex, aniSpeed = 15;
    private int playerAction = IDLE;
    private int playerDir = -1;
    private boolean moving = false;


    public GamePanel() {

        importBackground();
        importImg();
        loadAnimations();
        mouseInputs = new MouseInputs(this);
        setPanelSize();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }

    private void loadAnimations() {
        animations = new BufferedImage[7][10];

        for (int j = 0; j < animations.length; j++) {
            for (int i = 0; i < animations[j].length; i++) {
                animations[j][i] = img.getSubimage(i * 135, j*135, 135, 135);
            }
        }
    }

    private void importImg() {
        InputStream is = getClass().getResourceAsStream("/Animations.png");

        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void importBackground() {
        InputStream is = getClass().getResourceAsStream("/Background Test.png");

        try {
            background = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void setPanelSize() {
        Dimension size = new Dimension(1440,800);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    public void setDirection(int direction){
    this.playerDir = direction;
    moving = true;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public int getDirection() {
        return this.playerDir;
    }

    public boolean getMoving() {
        return this.moving;
    }

    public int getPlayerAction() {
        return this.playerAction;
    }

    private void updateAnimationTick() {

        aniTick++;
        if(aniTick >= aniSpeed){
            aniTick = 0;
            aniIndex++;
            if (aniIndex >= getSpriteAmount(playerAction))
                aniIndex = 0;
        }
    }

    public void setAnimation() {
        if (moving)
            playerAction = RUNNING;
        else
            playerAction = IDLE;

    }

    private void updatePosition(){
        if(moving)
            switch(playerDir) {
                case LEFT:
                    xDelta -= 5;
                    break;
                case UP:
                    yDelta -= 5;
                    break;
                case RIGHT:
                    xDelta += 5;
                    break;
                case DOWN:
                    yDelta += 5;
                    break;

            }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        updateAnimationTick();
        setAnimation();
        updatePosition();

        g.drawImage(background, 0, 0, 1440, 800, null );
        g.drawImage(animations[playerAction][aniIndex], (int)xDelta, (int)yDelta, 405, 405, null);


    }
}