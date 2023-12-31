package utilz;

public class Constants {

    public static class Directions  {
        public static final int LEFT = 0;
        public static final int UP = 1;
        public static final int RIGHT = 2;
        public static final int DOWN = 3;
    }

    public static class playerConstants{
        public static final int IDLE = 0;
        public static final int DEATH = 1;
        public static final int RUNNING = 2;
        public static final int ATTACK1 = 3;
        public static final int ATTACK2 = 4;
        public static final int ATTACK3 = 5;
        public static final int HURT = 6;

        public static int getSpriteAmount(int player_action){
            switch (player_action) {
                case IDLE:
                    return 10;
                case DEATH:
                    return 9;
                case RUNNING:
                    return 6;
                case ATTACK1:
                    return 5;
                case ATTACK2:
                case ATTACK3:
                    return 4;
                case HURT:
                    return 3;
                default:
                    return 1;
            }
        }
    }
}

