import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialEnd extends World
{

    private long startTime;
    public TutorialEnd()
    {    
        super(900, 600, 1);
        startTime = System.currentTimeMillis();
    }

    public void act(){
        long elapsed = System.currentTimeMillis() - startTime;
        if (elapsed >= 3000) {
            Greenfoot.setWorld(new Floor2());
        }
    }
}
