
/**
 * Write a description of class Arithmetic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arithmetic
{
    static int x = 8;
    
    public static void main(String[] args)
    {
        System.out.println(exception());
    }
    
    public static boolean exception()
    {
        if(x != 0)
            if(Math.sqrt(x) < 3 && x > 7)
                return true;
            else
                return false;
        else
            return false;
    }
}
