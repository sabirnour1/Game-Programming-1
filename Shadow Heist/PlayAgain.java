import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PlayAgain extends Actor
{
    private GreenfootImage normal;
    private GreenfootImage hovered;
    private boolean isHovered = false;
    public PlayAgain(){
    }
    public void act()
    {
        buttonFunctions();
    }

    public void buttonFunctions(){
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)){
            normal = new GreenfootImage("playAgain.png");
            setImage(normal);
            isHovered = false;
        }
        if (Greenfoot.mouseMoved(this)){
            hovered = new GreenfootImage("playAgainHov.png");
            hovered.scale(414, 89);
            setImage(hovered);
            if (!isHovered){
                Greenfoot.playSound("button1.mp3");
                isHovered = true;
            }
        }
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("button2.wav");
            Greenfoot.setWorld(new Floor1());
        }
    }
}
