import greenfoot.Color;

/**
 * Write a description of class Fn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fn  
{
    // instance variables - replace the example below with your own
    private static Color fillColor = new Color(255,255,255);
    private static Color outlineColor = new Color(0,0,0);

    /**
     * Constructor for objects of class Fn
     */
    public Fn()
    {
    }
    public static double distance(int x1, int y1, int x2,int y2){
        return (double)Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow(y1-y2,2)));
    }
    
    public static double map(double num,double inMin,double inMax ,double outMin, double outMax){
     return (num - inMin) * (outMax - outMin) / (inMax - inMin) + outMin;
    }
    

    
    
    
    public static Vector moveInDirection(double x1, double y1, double x2, double y2){
        
        Vector plPoz = new Vector(x1,y1);
        Vector position = new Vector(x2,y2);
        Vector aSub = new Vector(1,1);
        aSub.sub(plPoz, position);
        
        return aSub;
    }
    public static double lerp(double v0, double v1, double t) 
    {
     return v0*(1-t)+v1*t;
    }
    
    
    public static void fill(Color A)
    {
        
    }
    
    public static void fill(int r, int g, int b)
    {
        
    }
    
    public static void fill(int r, int g, int b, int a)
    {
        
    }
    
    
}
