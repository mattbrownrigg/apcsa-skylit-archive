
/**
 * Write a description of class Geometry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Geometry
{
    public static void main(String[] args)
    {
        System.out.println(sequence(2, 4, 6));
    }
    
    public static boolean sequence(int a, int b, int c)
    {
        if(a != 0 && b != 0 && c != 0 && (double)a/b == (double)b/c)
            return true;
        else
            return false;
    }
}
