import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Drone extends Actor
{
    int speed;
    int direction = 1;
    public Drone(int speed){
        this.speed = speed;
    }

    public void act()
    {
        movement();
    }

    public void movement(){ 
        setLocation(getX() + speed * direction, getY());
        if (isTouching(Wall1.class)){
            direction = direction * -1;
        }
    }
}
