import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import camera.*;
/**
 * Write a description of class WorldsWithTransition here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class WorldsWithTransition.
     * 
     */
    public static World camera;
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(2000, 1200, 1);
        addObject(Data.flowr, 500, 300);
        camera = new Camera(1000,700,this, Data.flowr);
        Greenfoot.setWorld(camera);
    }
    
}
