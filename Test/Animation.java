import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sprite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animation extends Actor
{
    /**
     * Act - do whatever the Sprite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage[] images ;
    private double speed;
    private Actor actor;
    public Animation(String[] images, double speed, Actor a)
    {
       actor = a;
       for(int i = 0 ; i < images.length; i++)
       {
           this.images[i] = new GreenfootImage(images[i] + ".png");
       }
       this.speed = speed;
    }
    public Animation(String imgPrefix, int count, double speed, Actor a)
    {
       actor = a;
        for(int i = 0 ; i < images.length; i++)
       {
           this.images[i] = new GreenfootImage(imgPrefix + i + ".png");
       }
       this.speed = speed;
    }
    public Animation(GreenfootImage[] images, double speed, Actor a)
    {
       actor = a;
         for(int i = 0 ; i < images.length; i++)
       {
           this.images[i] = images[i];
       }
       this.speed = speed;
    }
    public void act()
    {
        // Add your action code here.
    }
}
