
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Circle
{
    private double area;
    private double radius;
    
    public Circle(double r)
    {
        //System.out.println("Git Area Cons" + area);
        radius = r;
        //System.out.println("Git r " + r);
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public double getArea()
    {
        area = Math.PI * radius * radius;
        //area = radius * radius;
        //System.out.println("Git Area");
        return area;
    }
}
