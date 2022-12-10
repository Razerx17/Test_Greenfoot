import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor
{
    /**
     * Act - do whatever the Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GreenfootImage image = new GreenfootImage("button_background.png");
    public String text = "default ";
    public int fontSize = 50;
    public Text txt;
    public int backWidth;
    public int backHeight;

    

    public void act()
    {
        checkHoover();
       
       
    }

    
    public void addedToWorld(World world)
    {
        image.setTransparency(255);
        image.scale(100,100);
        image.setColor(Color.BLACK);
        image.fill();
        setImage(image);
        txt = new Text(text, fontSize, Color.CYAN, null);
        getWorld().addObject(txt, getX(),getY() - fontSize);
        
    }

    
    public void moveLocation(int x, int y)
    {   
        int a = getX() - x;
        int b = getY() - y;
        setLocation(x,y);
        txt.setLocation(txt.getX() - a, txt.getY() - b);
    }
    
    public void lerpMove(int x, int y, double t)
    {
         int a = (int)Fn.lerp(getX(), x, t);
         int b = (int)Fn.lerp(getY(), y, t);
         moveLocation(a,b);
    }
    
    public void moveLocation1(int x, int y)
    {   
       
        txt.setLocation(x,y);
    }   
    
    public void lerpMove1(int x, int y, double t)
    {
         int a = (int)Fn.lerp(getX(), x, t);
         int b = (int)Fn.lerp(getY(), y, t);
         moveLocation(a,b);
    }
    //show
    public boolean hover = false;
    public boolean clicked = false;
    public void checkHoover()
    {
        
        if(Greenfoot.mouseMoved(null)  )
        {
            if( Greenfoot.mouseMoved(this) || Greenfoot.mouseMoved(txt))
            {
              hover = true;
            }
            else
              hover = false;
        }  
    }
    public void click()
    {
        clicked = hover && Greenfoot.mouseClicked(null);
    }

    public void setText(String str, int fontSize_, Color a, Color b)
    {
        getWorld().removeObject(txt);
        txt = new Text(str, fontSize_, a, b);
        getWorld().addObject(txt, getX(),getY());
    }

}
