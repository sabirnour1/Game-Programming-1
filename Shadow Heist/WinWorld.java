import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinWorld extends World
{

    private GreenfootSound music = new GreenfootSound("WinningMusic.mp3");
    /**
     * Constructor for objects of class WinWorld.
     * 
     */
    public WinWorld()
    {    
        super(970, 625, 1); 
        prepare();
        Floor2.music.stop();
        music.playLoop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayAgain playAgain = new PlayAgain();
        addObject(playAgain,701,281);
        EndMenuButton endMenuButton = new EndMenuButton();
        addObject(endMenuButton,695,401);
    }
}
