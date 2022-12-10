import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Settings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Settings extends World
{

    /**
     * Constructor for objects of class Settings.
     * 
     */
    public Menu_Button back;
    public Settings()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 677, 1); 
        back = new Menu_Button("   back   ", 6);
        addObject(back, 200, 600);
    }
    
    public void act()
    {
       
    }
}
