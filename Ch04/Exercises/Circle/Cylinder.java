
/**
 * Write a description of class Cylinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Cylinder
{
    Circle userCylinder;
    private int height;
    private double volume;
    
    public Cylinder(double r, int h)
    {
        userCylinder = new Circle(r); 
        //System.out.println("Git Area Cons" + area);
        //System.out.println("Git r " + r);
        height = h;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getVolume()
    {
        volume = userCylinder.getArea() * height;
        return volume;
    }
}
