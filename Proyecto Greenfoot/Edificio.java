import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Edificio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Edificio extends Actor
{
    /**
     * Act - do whatever the Edificio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed;
    public void act()
    {
        move(speed);
        if(isAtEdge())
        {
            Greenfoot.delay(30);
            Greenfoot.setWorld(new EndGameScreen());
        }
    }
}
