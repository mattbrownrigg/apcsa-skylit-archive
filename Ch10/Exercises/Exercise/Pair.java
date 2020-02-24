package Ch10.Exercises.Exercise;

/**
 * Write a description of class Pair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pair
{
    
    private double first, second;

    /**
     * Constructor for objects of class Pair
     */
    public Pair(double a, double b)
    {
        first = a;
        second = b;
    }

    
    public void swap()
    {
        double temp = first; first = second; second = temp;
    }
    
    public Pair objSwap()
    {
        return new Pair(second, first);
    }
}
