import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flowr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flowr extends Animator
{
    
    
    
    
    
    private Vector movement = new Vector(0,0);
    //public Sprite rand = new Sprite("run", 4, 0.1,this);
    
    public flowr()
    {
        //getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
        setImage(getImage());
    }
    public void act()   
    {
        movement.x = Data.HorizontalInput();
        movement.y = Data.VerticalInput();   
        movement.mult(6);
        setLocation(getX() + (int)movement.x , getY() + (int)movement.y);
        
        
    }
}
