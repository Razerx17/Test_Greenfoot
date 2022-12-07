import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Buttons
{
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String text;
    private int font;
    private Color a;
    private Color b;
    public Text(String text_, int font_, Color a_, Color b_)
    {
      text = text_;
      font = font_;
      a = a_;
      b = b_;
    }
    public Text(String text_, int font_)
    {
        text = text_;
        font = font_;
        a = Color.BLACK;
        b = null;
       
    }
    public void addedToWorld(World world)
    {
      GreenfootImage img = new GreenfootImage((int)(text.length() * font / 2.3) , font + 7);
      
      int placeX = 0;
      int placeY = 3;   
      img.drawImage(new GreenfootImage(text, font, a, b), placeX, placeY );
      setImage(img);        
    }
    
    public void setColor(Color a_, Color b_)
    {
        
    }
    public void act()
    {
        
    }
}
