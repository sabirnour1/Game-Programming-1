import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    public MainMenu()
    {    
        super(1198, 686, 1); 
        GreenfootImage menu = new GreenfootImage("MainMenu.png");
        menu.scale(1198, 686);
        setBackground(menu);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayButton playButton = new PlayButton();
        addObject(playButton,609,287);
    }
}
