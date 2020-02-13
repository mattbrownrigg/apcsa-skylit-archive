
/**
 * Write a description of class PerfectSquare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PerfectSquare
{
    public static void main(String[] args)
    {
        System.out.println(perfectSqr(8));
    }
    
    public static boolean perfectSqr(int n)
    {
        if( n == Math.pow(Math.round(Math.sqrt(n)), 2))
            return true;
        else
            return false;
    }
}
