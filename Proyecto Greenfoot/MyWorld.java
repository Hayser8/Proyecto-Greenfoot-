import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int score = 0;
    int enemyCount = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 700, 1); 
        Bombero mainBombero = new Bombero();
        addObject (mainBombero, 400, 200);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        score = 0;
    }
    public void act()
    {
         showText("Puntos: " + score, 50, 25);
         enemyCount++;
         if(enemyCount>59)
         {
             addCasa();
             addEdificio();
             enemyCount = 0;
         }
    }
    public void addCasa()
    {
        Casa casa = new Casa();
        addObject(casa, 700, Greenfoot.getRandomNumber(700));
        casa.speed = -2;
    }
    public void addEdificio()
    {
        Edificio edificio = new Edificio();
        addObject(edificio, 700, Greenfoot.getRandomNumber(700));
        edificio.speed = -3;
    }
}
