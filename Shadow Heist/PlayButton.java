import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Actor
{
    private GreenfootImage normal;
    private GreenfootImage hovered;
    private boolean isHovered = false;
    private GreenfootSound music = new GreenfootSound("menuMusic.mp3");
    public PlayButton(){
        music.playLoop();
    }
    public void act()
    {
        buttonFunctions();
    }

    public void buttonFunctions(){
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)){
            normal = new GreenfootImage("PlayButton.png");
            setImage(normal);
            isHovered = false;
        }
        if (Greenfoot.mouseMoved(this)){
            hovered = new GreenfootImage("PlayButtonHov.png");
            setImage(hovered);
            if (!isHovered){
                Greenfoot.playSound("button1.mp3");
                isHovered = true;
            }
        }
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("button2.wav");
            music.stop();
            Greenfoot.setWorld(new Floor1());
        }
    }
}
