

public class Vector  
{
    public double x;
    public double y;
    public Vector(double x_, double y_)
    {
        x = x_;
        y = y_;
    }
    public Vector(Vector a, Vector b){
        x = a.x - b.x;
        y = a.y - b.y;
    }
    public double mag(){
        return (double)Math.sqrt(( (x * x) + (y * y) ));
    }

    public void normalize(){
        double tempMag = mag();
        x /= tempMag;
        y /= tempMag;
    }
    public void mult(double value){
        x *= value;
        y *= value;
    }
    public void sub(Vector value){
        x -= value.x;
        y -= value.y;
    }
    public void sub(Vector value1, Vector value2){
        x = value1.x - value2.x;
        y = value1.y - value2.y;
    }
    public void add(Vector vec){
        x += vec.x;
        y += vec.y;
    }
    public void set(Vector value){
        x = value.x;
        y = value.y;
    }
    public void set(double x_, double y_){
        x = x_;
        y = y_;
    }
    
}
