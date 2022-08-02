import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Casa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casa extends Actor
{
    /**
     * Act - do whatever the Casa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed;
    public void act()
    {
        World w = getWorld();
        move(speed);
        if(isAtEdge())
        {
            Greenfoot.delay(30);
            Greenfoot.setWorld(new EndGameScreen());
        }
    }
}
