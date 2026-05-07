import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EndMenuButton extends Actor
{
    private GreenfootImage normal;
    private GreenfootImage hovered;
    private boolean isHovered = false;
    public EndMenuButton(){
    }
    public void act()
    {
        buttonFunctions();
    }

    public void buttonFunctions(){
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)){
            normal = new GreenfootImage("endMenuButton.png");
            setImage(normal);
            isHovered = false;
        }
        if (Greenfoot.mouseMoved(this)){
            hovered = new GreenfootImage("endMenuButtonHov.png");
            setImage(hovered);
            if (!isHovered){
                Greenfoot.playSound("button1.mp3");
                isHovered = true;
            }
        }
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("button2.wav");
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
