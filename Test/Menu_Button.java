import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu_Button extends Buttons
{
    /**
     * Act - do whatever the Menu_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int initX , initY;
    private String tempString;
    private int type;
    public Menu_Button( String lel, int type_)
    {
        tempString = lel;
        type = type_;
        fontSize = 72;
    }

    public void addedToWorld(World world)
    {
        image.scale(300,50);
        image.setColor(Color.WHITE);
        image.fill();
        image.setTransparency(0);
        setImage(image);
        initX = getX();
        initY = getY(); 
        setText(tempString, fontSize, Color.WHITE, Color.BLACK);
    }

    public void act()
    {
        checkHoover();
        swipe();
        click();
        if(hover && Greenfoot.mouseClicked(null))
        {   
            
              
            switch(type)
            {
                case 1:
                    Greenfoot.setWorld(Data.world1);
                    Data.world1.addObject(new Transition(0.1), 0, 0);
                    break;
                case 3:
                    Greenfoot.stop();
                    break;
                case 2:
                    Greenfoot.setWorld(Data.help);
                    break;
                case 5:
                    Greenfoot.setWorld(Data.titleScreen);
                    break;
                case 6:
                    Greenfoot.setWorld(Data.titleScreen);
                    break;
                case 4:
                    Greenfoot.setWorld(Data.settings);
                    break;


            }
        }
    }

    public void swipe()
    {
        if(hover)
        {
            lerpMove(initX + 30 ,initY ,0.3);
            int col = (int)Fn.map(getX(),initX , initX + 30, 255, 0);
            int inv = (int)Fn.map(getX(),initX , initX + 30, 0, 255);

            setText(tempString,fontSize, new Color( col, 255, 255 ), new Color(255, 255, 255, inv / 2));
    
        }
        else
        {
            int col = (int)Fn.map(getX(),initX , initX + 30, 255, 0);
            int inv = (int)Fn.map(getX(),initX , initX + 30, 0, 255);

            setText(tempString,fontSize, new Color( col, 255, 255), new Color(255, 255, 255, inv / 2 ));
            lerpMove(initX , initY, 0.3);
        }
    }

}
