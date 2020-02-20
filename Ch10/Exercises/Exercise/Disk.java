
/**
 * Write a description of class Disk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Disk
{
    private Point center;
    private double radius;
    
    public Disk(Disk disc)
    {
        this.center = new Point(disc.center);
        this.radius = disc.radius;
    }

    
}
