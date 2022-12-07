import greenfoot.World;
import greenfoot.*;
public class Data
{
    
    
    
    public static World settings = new Settings();
    public static World world1 = new Level1();
    public static World help = new Help();
    public static World titleScreen = new TitleScreen();
    public static String hotKeys[] = {"a","d",
                                      "w","s"
                                     };
    
    public static int HorizontalInput()
    {
        if(Greenfoot.isKeyDown(hotKeys[0]) && !Greenfoot.isKeyDown(hotKeys[1]))
         return -1;
        if(Greenfoot.isKeyDown(hotKeys[1]) && !Greenfoot.isKeyDown(hotKeys[0]))
         return 1;
        return 0;
    }
    
    public static int VerticalInput()
    {
        if(Greenfoot.isKeyDown(hotKeys[2]) && !Greenfoot.isKeyDown(hotKeys[3]))
         return -1;
        if(Greenfoot.isKeyDown(hotKeys[3]) && !Greenfoot.isKeyDown(hotKeys[2]))
         return 1;
        return 0;
    }
    
    public static Actor b;
    public static void change(Actor a)
    {
        
        b = a;
        System.out.println(b);  
        b.setImage("bee.png");
    }
}