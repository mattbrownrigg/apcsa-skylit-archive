
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{
    int numDots;
    
    public Die(){ }
    
    public void roll()
    {
        this.numDots = ((int)(Math.random() * 6) + 1);
    }
    
    public int getNumDots()
    {
        return numDots;
    }
}
