import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Guard extends Actor
{
    int speed;
    int direction = 1;
    public Guard(int speed){
        this.speed = speed;
    }

    public void act()
    {
        movement();
    }

    public void movement(){ 
        setLocation(getX(), getY() + speed * direction);
        if (getY() >= 570){
            direction = -1;
        }
        if(getY() <= 30){
            direction = 1;
        }
    }
}
