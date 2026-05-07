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
        addObject(mainActor,800,300);
        Key key = new Key();
        addObject(key,124,300);
        Safe safe = new Safe();
        addObject(safe,550,500);
        Guard guard = new Guard(1);
        addObject(guard,450,300);
    }
}
