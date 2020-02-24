package Ch10.Exercises.Exercise;

/**
 * Write a description of class Point here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Point
{
    private double x;
    private double y;
    
    public Point(Point point)
    {
        this.x = point.x;
        this.y = point.y;
    }
    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
}
