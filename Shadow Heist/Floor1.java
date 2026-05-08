import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Floor1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Floor1 extends World
{

    /**
     * Constructor for objects of class Floor1.
     * 
     */
    public Floor1()
    {    
        super(900, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        MainActor mainActor = new MainActor();
        addObject(mainActor,73,73);
        TopWall topWall = new TopWall();
        addObject(topWall,450,10);
        TopWall topWall1 = new TopWall();
        addObject(topWall1,450,590);
        Key key = new Key();
        addObject(key,124,300);
        Safe safe = new Safe();
        addObject(safe,550,500);
        Guard guard = new Guard(1);
        addObject(guard,450,300);
        key.setLocation(125,300);
        KeySpawn keySpawn = new KeySpawn();
        addObject(keySpawn,125,300);
    }
}
