import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Floor3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Floor3 extends World
{
    public Floor3()
    {    
        super(900, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        SideWall sideWall = new SideWall();
        addObject(sideWall,10,300);
        SideWall sideWall1 = new SideWall();
        addObject(sideWall1,890,300);
        TopWall topWall = new TopWall();
        addObject(topWall,450,10);
        TopWall topWall1 = new TopWall();
        addObject(topWall1,450,590);
    }
}
