package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utilz.Constants.Directions.*;
import static utilz.Constants.playerConstants.RUNNING;

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
}