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
   
    
    public void addedToWorld(World world)
    {
        System.out.println(this);
        Data.change(this);
        System.out.println(Fn.distance(705, -515, 266, -450));
    }
    public void act()   
    {
        movement.x = Data.HorizontalInput();
        movement.y = Data.VerticalInput();
        movement.normalize();   
        movement.mult(5);
        if(movement.x != 0 && movement.y != 0)
           movement.mult(1.20);
        setLocation(getX() + (int)movement.x , getY() + (int)movement.y);
        
        
    }
}
