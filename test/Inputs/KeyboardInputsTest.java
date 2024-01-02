package Inputs;

import Main.GamePanel;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardInputsTest {

    @Test
    void keyReleased() throws InterruptedException, AWTException {
        Thread.sleep(1000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_I);

        robot.keyPress(KeyEvent.VK_SPACE);

        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_S);

        robot.keyPress(KeyEvent.VK_SPACE);

        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_S);

        robot.keyPress(KeyEvent.VK_SPACE);

        robot.keyPress(KeyEvent.VK_A);


        robot.keyPress(KeyEvent.VK_SPACE);

        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_T);

        robot.keyPress(KeyEvent.VK_ENTER);

    }

    // :( doesnt work
//    @Test
//    void keyPressed() throws AWTException {
//        GamePanel gamePanel = new GamePanel();
//        KeyboardInputs keyboardInputs = new KeyboardInputs(gamePanel);
//
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_W);
//
//        assertEquals(1, gamePanel.getDirection());
//    }
}