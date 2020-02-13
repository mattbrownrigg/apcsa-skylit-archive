
/**
 * Write a description of class sqrt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sqrt
{
    public static double sqrtEst(double a)
    {
        double x = a/2;
        double diff;
        int n = 0;
        
        do
        {
            x = 1/2 * (x + a/x);
            n++;
        } while(n <= a);
        
        return x;
    }
}
