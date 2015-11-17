package configuration;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by ManuGil on 09/03/15.
 */

public class Configuration {

    public static final String GAME_NAME = "CANDY TAP ";
    public static final boolean DEBUG = false;
    public static final boolean SPLASHSCREEN = true;

    //ADMOB IDS
    public static final String AD_UNIT_ID_BANNER = "ca-app-pub-7973299225387096/6341322368";
    public static final String AD_UNIT_ID_INTERSTITIAL = "ca-app-pub-7973299225387096/3865533961";
        public static float AD_FREQUENCY = .9f;

    //In App Purchases
    public static final String ENCODED_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAi7Zoc0ySbSx85kgH8d2iGSlQlpG6Zq3I1DcHN+6KeP7BY5y1lyEhR+KQK4Ff/fPBLN+cdrX+tCy2bd/o/+w80Y5B7F4phgRNmtIRdOVQf8jw2D/g7l5ZsJNr5p3Cik7GIkPIjRomgxuR4GMRcWOg5ULnyi6iTtqwTitop5FplZVUNL9FTF7xJosvsk2OakBBR/WDQ+owu0lboPAGtDgi/AZepiPQi293fTAi1820WikWrr6O8xHgtwKmAI4tpxGeqyxPIKlH2+UmT2jD2yv1rF9b7XsA2RKd8/r2E94ZZZtNaNHOZF30I+NF94+Hc1wNWgg+bRHtXhC4M7Dv8/srmQIDAQAB";
    public static final String PRODUCT_ID = "removeads";

    //LEADERBOARDS
    public static final String LEADERBOARD_HIGHSCORE = "CgkI3bqR8o0FEAIQAA";
    public static final String LEADERBOARD_GAMESPLAYED = "CgkI3bqR8o0FEAIQAg";
    public static final String LEADERBOARD_BUTTONS_CLICKED = "CgkI3bqR8o0FEAIQAQ";

    //ACHIEVEMENTS IDS Points
    public static final String ACHIEVEMENT_50_P = "CgkI3bqR8o0FEAIQAw";
    public static final String ACHIEVEMENT_100_P = "CgkI3bqR8o0FEAIQBA";
    public static final String ACHIEVEMENT_200_P = "CgkI3bqR8o0FEAIQBQ";
    public static final String ACHIEVEMENT_300_P = "CgkI3bqR8o0FEAIQBg";
    public static final String ACHIEVEMENT_500_P = "CgkI3bqR8o0FEAIQBw";
    public static final String ACHIEVEMENT_1000_P = "CgkI3bqR8o0FEAIQCA";
    //GAMES PLAYED
    public static final String ACHIEVEMENT_10_GP = "CgkI3bqR8o0FEAIQCQ";
    public static final String ACHIEVEMENT_25_GP = "CgkI3bqR8o0FEAIQCg";
    public static final String ACHIEVEMENT_50_GP = "CgkI3bqR8o0FEAIQEQ";
    public static final String ACHIEVEMENT_100_GP = "CgkI3bqR8o0FEAIQCw";
    public static final String ACHIEVEMENT_200_GP = "CgkI3bqR8o0FEAIQDA";
    //TOTAL TAPS
    public static final String ACHIEVEMENT_50_T = "CgkI3bqR8o0FEAIQDQ";
    public static final String ACHIEVEMENT_200_T = "CgkI3bqR8o0FEAIQDw";
    public static final String ACHIEVEMENT_500_T = "CgkI3bqR8o0FEAIQDg";
    public static final String ACHIEVEMENT_1000_T = "CgkI3bqR8o0FEAIQEA";

    //COLORS
    //COLORS OF BUTTONS
    public static final String COLOR_BUTTON_1 = "#BB2824";
    public static final String COLOR_BUTTON_2 = "#88CAFA";
    public static final String COLOR_BUTTON_3 = "#62AE2E";
    public static final String COLOR_BUTTON_4 = "#DC98EE";
    public static final String COLOR_BUTTON_5 = "#f9d91b";



    //BOARD
    public static final String COLOR_BOARD = "#2c3e50";

    //MENU
    public static final String COLOR_PLAY_BUTTON = "#2ecc71";
    public static final String COLOR_LEADERBOARD_BUTTON = "#e74c3c";
    public static final String COLOR_SHARE_BUTTON = "#EDB49C";
    public static final String COLOR_ACHIEVEMENTS_BUTTON = "#f39c12";
    public static final String COLOR_ADS_BUTTON = "#9b59b6";

    public static final String COLOR_BACKGROUND_COLOR = "#ecf0f1";

    //GAMEPLAY VARIABLES
    public static final float HIGHEST_ADD_TIME = 2.2f;
    public static final float LOWEST_ADD_TIME = 1.6f;
    public static final float START_TIMER = 9;
    public static final int BUTTON_SIZE = 180;
    public static final int BUTTON_SIZE1 = 140;
    public static final int BUTTON_SIZE2 = 100;
    public static final int BUTTON_SIZE3 = 110;
    public static final int BUTTON_SIZE4 = 250;

    //TEXTs
    public static final String HIGHSCORE_TEXT = "High Score";
    public static final String GAMESPLAYED_TEXT = "Games Played";
    public static final String BUTTONSCLICKED_TEXT = "Total Taps";
    public static final String SCORE_TEXT = "Score";

    //Share Message
    public static final String SHARE_MESSAGE = "Have you tried " + GAME_NAME +
            "? Best Game EVER! Download here! ";



}
