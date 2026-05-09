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
        GreenfootImage menu = new GreenfootImage("Back Grond.png");
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
        playButton.setLocation(325,552);
        Char char_ = new Char();
        addObject(char_, 733, 386);

        playButton.setLocation(268,586);
        playButton.setLocation(280,603);
        playButton.setLocation(245,600);
    }
}
