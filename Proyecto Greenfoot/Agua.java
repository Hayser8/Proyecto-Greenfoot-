import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Agua here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Agua extends Mover
{
    MyWorld thisGame;
    /**
     * Act - do whatever the Agua wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10.0);
        edificioSonido();
        swatEdificio();
        casaSonido();
        swatCasa();
        eliminateAgua();
    }
    public void swatEdificio()
    {
        Actor foundEdificio = getOneIntersectingObject(Edificio.class);
        if(isTouching(Edificio.class)) 
            thisGame.score++;
            getWorld().removeObject(foundEdificio);
    }
    public void swatCasa()
    {
        Actor foundCasa = getOneIntersectingObject(Casa.class);
        if(isTouching(Casa.class))
            thisGame.score++;
            getWorld().removeObject(foundCasa);
    }
    public void eliminateAgua()
    {
        if(atWorldEdge())
            getWorld().removeObject(this);
    }
    public void casaSonido()
    {
        Actor foundCasa = getOneIntersectingObject(Casa.class);
        if(isTouching(Casa.class))
            Greenfoot.playSound("agua.wav");
    }
    public void edificioSonido()
    {
        Actor foundEdificio = getOneIntersectingObject(Edificio.class);
        if(isTouching(Edificio.class))
            Greenfoot.playSound("agua.wav");
    }
}

