package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utilz.Constants.Directions.*;


class GamePanelTest {

    GamePanel gamePanel = new GamePanel();

    @Test
    void setDirection_LEFT() {
        gamePanel.setDirection(LEFT);
        assertEquals(0, gamePanel.getDirection());
        assertTrue(gamePanel.getMoving());
    }

    @Test
    void setDirection_UP() {
        gamePanel.setDirection(UP);
        assertEquals(1, gamePanel.getDirection());
        assertTrue(gamePanel.getMoving());
    }

    @Test
    void setDirection_RIGHT() {
        gamePanel.setDirection(RIGHT);
        assertEquals(2, gamePanel.getDirection());
        assertTrue(gamePanel.getMoving());
    }

    @Test
    void setDirection_DOWN() {
         gamePanel.setDirection(DOWN);
        assertEquals(3, gamePanel.getDirection());
        assertTrue(gamePanel.getMoving());
    }

    @Test
    void setAnimation_RUNNING() {
        gamePanel.setMoving(true);
        gamePanel.setAnimation();
        assertEquals(2, gamePanel.getPlayerAction());
    }

    @Test
    void setAnimation_IDLE() {
        gamePanel.setMoving(false);
        gamePanel.setAnimation();
        assertEquals(0, gamePanel.getPlayerAction());
    }

    @Test
    void updatePosition_LEFT() {
        gamePanel.setMoving(true);
        gamePanel.setDirection(LEFT);
        gamePanel.updatePosition();
        assertEquals(95, gamePanel.getxDelta());
    }
    @Test
    void updatePosition_UP() {
        gamePanel.setMoving(true);
        gamePanel.setDirection(UP);
        gamePanel.updatePosition();
        assertEquals(95, gamePanel.getyDelta());
    }
    @Test
    void updatePosition_RIGHT() {
        gamePanel.setMoving(true);
        gamePanel.setDirection(RIGHT);
        gamePanel.updatePosition();
        assertEquals(105, gamePanel.getxDelta());
    }
    @Test
    void updatePosition_DOWN() {
        gamePanel.setMoving(true);
        gamePanel.setDirection(DOWN);
        gamePanel.updatePosition();
        assertEquals(105, gamePanel.getyDelta());
    }

}