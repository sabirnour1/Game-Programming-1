import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Char here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Char extends Actor
{
    /**
     * Act - do whatever the Char wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
             updateAppearance();
    }
    private void updateAppearance() {
        PlayButton pb = (PlayButton) getWorld().getObjects(PlayButton.class).get(0);

        if (pb.getHoverStatus()) {
            setImage("menus char1.png");   // hover version
        } else {
            setImage("menus char12 .png");  // normal version
        }
    }

}   
