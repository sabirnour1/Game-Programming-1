import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class MainActor extends Actor
{
    GreenfootImage[] run = new GreenfootImage[4];
    GreenfootImage[] walkFront = new GreenfootImage[4];
    GreenfootImage[] walkBack = new GreenfootImage[4];
    GreenfootImage[] walkLeft = new GreenfootImage[4];
    GreenfootImage[] walkRight = new GreenfootImage[4];
    int frame = 0;
    int runSpeed = 2;
    int animationDelay = 9;
    int delayCounter = 0;
    boolean keyCollected = false;
    boolean safeCollected = false;
    int blockX;
    int blockY;
    long startTime = 0;
    boolean canDie = true;
    int startDelay = 0;
    int moveDelay;
    String direction = "front";
    
    public MainActor()
    {
        for (int i = 0; i < 4; i++) {
            walkFront[i] = new GreenfootImage("mainwalkingfront" + i + ".png");
            walkBack[i]  = new GreenfootImage("mainwalkingback" + i + ".png");
            walkLeft[i]  = new GreenfootImage("walking" + i + ".png");
            walkRight[i] = new GreenfootImage("walkingright" + i + ".png");
        }
        blockX = 73;
        blockY = 73;
        canDie = true;
        keyCollected = false;
        safeCollected = false;
    }

    public void act(){
        try {
            if (getWorld() == null) return;
            moveDelay++;
            if (moveDelay > 100)
                move();
            die();
            collectKey();
            collectSafe();
        } catch (NullPointerException e) {
        }
    }

    public void move(){
        if (getWorld() == null) return; 
        if (!isTouching(Wall1.class)){
            blockX = getX();
            blockY = getY();
        }
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")){
            direction = "back";
            animateRun();
            setLocation(getX(), getY() - runSpeed);
        }
        if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")){
            direction = "front";
            animateRun();
            setLocation(getX(), getY() + runSpeed);
        }
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            moveRight();
            setLocation(getX() + runSpeed, getY());
        }
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            moveLeft();
            setLocation(getX() - runSpeed, getY());
        }
        if (isTouching(Wall1.class)){
            setLocation(blockX, blockY);
        }
        run();
    }

    public void run(){
        if(Greenfoot.isKeyDown("shift")){
            runSpeed = 4;
            animationDelay = 5;
        }else{
            runSpeed = 2;
            animationDelay = 9;
        }
    }

    public void moveLeft(){
        direction = "left";
        animateRun();
        
    }

    public void moveRight(){
        direction = "right";
        animateRun();
        
    }

    public void animateRun(){
        delayCounter++;
        delayCounter++;

        if (delayCounter >= animationDelay) {
    
            if (direction.equals("front")) {
                setImage(walkFront[frame]);
            }
            else if (direction.equals("back")) {
                setImage(walkBack[frame]);
            }
            else if (direction.equals("left")) {
                setImage(walkLeft[frame]);
            }
            else if (direction.equals("right")) {
                setImage(walkRight[frame]);
            }

            frame++;
            if (frame >= 4) frame = 0;
        
            delayCounter = 0;
        }
    }

    public void die(){
        if (isTouching(Guard.class) || isTouching(Drone.class)){
            setLocation(73, 73);
            Greenfoot.playSound("death.wav");
            if (keyCollected){
                Actor spawn = getWorld().getObjects(KeySpawn.class).get(0);
                getWorld().addObject(new Key(), spawn.getX(), spawn.getY());
            }
            keyCollected = false;
            safeCollected = false;
        }
    }

    public void collectKey(){
        if (isTouching(Key.class)){
            Actor key = getOneIntersectingObject(Key.class);
            Greenfoot.playSound("collectKey.mp3");
            getWorld().removeObject(key);
            keyCollected = true;
        }
    }

    public void collectSafe(){
        if (keyCollected && isTouching(Safe.class)){    
            Actor safe = getOneIntersectingObject(Safe.class);
            getWorld().removeObject(safe);
            Greenfoot.playSound("collectSafe.mp3");
            canDie = false;
            Greenfoot.setWorld(new TutorialEnd());
        }
        if (keyCollected && isTouching(Safe1.class)){
            Actor safe1 = getOneIntersectingObject(Safe1.class);
            getWorld().removeObject(safe1);
            Greenfoot.playSound("collectSafe.mp3");
            Greenfoot.setWorld(new Floor3());
        }
        if (keyCollected && isTouching(Safe2.class)){
            Actor safe2 = getOneIntersectingObject(Safe2.class);
            getWorld().removeObject(safe2);
            Greenfoot.playSound("collectSafe.mp3");
            Greenfoot.setWorld(new Floor4());
        }
        if (keyCollected && isTouching(Safe3.class)){
            Actor safe3 = getOneIntersectingObject(Safe3.class);
            getWorld().removeObject(safe3);
            Greenfoot.playSound("collectSafe.mp3");
            Greenfoot.playSound("winSound.mp3");
            Greenfoot.setWorld(new WinWorld());
        }
    }
}