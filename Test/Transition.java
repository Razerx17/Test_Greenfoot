import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Transition here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transition extends Actor
{
    /**
     * Act - do whatever the Transition wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Transition(double speed)
    {
        this.speed = speed * 4.25;
       
    }
    public void addedToWorld(World world)
    {
        setLocation(world.getWidth() / 2, world.getHeight() / 2);
        GreenfootImage img = new GreenfootImage(getWorld().getWidth(), getWorld().getHeight());
        img.setColor(Color.BLACK);
        img.fill();
        setImage(img);
    }
    private double trans = 255;
    private double speed;
    public void act()
    {
       speed *= 1.01;
       trans -= speed;
       if(trans > 0)
       {
         getImage().setTransparency((int)trans);
         setImage(getImage());
       } 
       else
         getWorld().removeObject(this);
    }
}
