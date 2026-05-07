import greenfoot.*; // Greenfoot classes
import java.util.*; // If you need utilities like ArrayList, etc.

/**
 * Title screen world.
 * Automatically switches to Floor world after 5 seconds.
 */
public class SplashScreen extends World {
    private long startTime;

    public SplashScreen() {
        super(900, 800, 1); // World size: 900x800, cell size: 1px
        startTime = System.currentTimeMillis();
        prepare();
    }

    public void act() {
        long elapsed = System.currentTimeMillis() - startTime;
        if (elapsed >= 3000) {
            Greenfoot.setWorld(new MainMenu());
        }
    }
    
    private void prepare()
    {
    }
}