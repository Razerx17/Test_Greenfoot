import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int width,height;
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 677, 1); 
        
        width = 20;
        height = 60;
        prepare();
        
        
    }   
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Menu_Button menu_Button = new Menu_Button("    Play    ",1);
        addObject(menu_Button, 580 + width,180  + height);

        Menu_Button menu_Button2 = new Menu_Button("    Settings    ",4);
        addObject(menu_Button2,643 + width ,260 + height);

        Menu_Button menu_Button3 = new Menu_Button("    Help    ",2);
        addObject(menu_Button3,580 + width,340 + height);
        Menu_Button menu_Button4 = new Menu_Button("    Exit    ", 3);
        addObject(menu_Button4,580 + width , 420 + height);       

       
    }
}
