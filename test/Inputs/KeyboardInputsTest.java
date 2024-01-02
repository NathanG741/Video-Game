package Inputs;

import Main.GamePanel;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardInputsTest {

    @Test
    void keyReleased() {
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