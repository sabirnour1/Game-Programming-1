import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Guard extends Actor
{
    int speed;
    int direction = 1;
    GreenfootImage[] run = new GreenfootImage[4];
    int frame = 0;
    int animationDelay = 15;
    int delayCounter = 0;
    public Guard(int speed){
        this.speed = speed;
    }

    public void animation(){
        for(int i = 0; i < run.length; i++){
            run[i] = new GreenfootImage("Guard" + i + ".png");
        }
        delayCounter++;

        if(delayCounter >= animationDelay) {
            setImage(run[frame]);
            frame++;
            if(frame >= run.length) {
                frame = 0;
            }
            delayCounter = 0;
        }
    }

    public void act()
    {
        movement();
        animation();
    }

    public void movement(){ 
        setLocation(getX(), getY() + speed * direction);
        if (isTouching(Wall1.class)){
            direction = direction * -1;
        }
    }
}
