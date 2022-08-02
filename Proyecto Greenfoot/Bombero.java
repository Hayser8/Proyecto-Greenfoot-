import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bombero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bombero extends Actor
{
    /**
     * Act - do whatever the Bombero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
    }
    public void moveAround(){
        if(Greenfoot.isKeyDown("s"))
        setLocation(getX(), getY() + 4);
        if(Greenfoot.isKeyDown("w"))
        setLocation(getX(), getY() - 4);
        if(Greenfoot.isKeyDown("d"))
        setLocation(getX() + 4, getY());
        if(Greenfoot.isKeyDown("a"))
        setLocation(getX() - 4, getY());
        if(Greenfoot.isKeyDown("left"))
        setRotation(getRotation() - 5);
        if(Greenfoot.isKeyDown("right"))
        setRotation(getRotation() + 5);
        if("space".equals(Greenfoot.getKey()))
        fire();
    }
    private void fire(){
        Agua agua = new Agua();
        getWorld().addObject(agua,getX(),getY());
        agua.setRotation(getRotation());
        agua.move(40.0);
    }
    
}
