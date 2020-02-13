
/**
 * Write a description of class Xor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Xor
{
    static boolean x, y;
    
    public static void main(String[] args)
    {
        x = true;
        y = true;
        System.out.println(xorOne());
        System.out.println(xorTwo());
        System.out.println(xorThree());
        System.out.println("--------------");
        
        x = true;
        y = false;
        System.out.println(xorOne());
        System.out.println(xorTwo());
        System.out.println(xorThree());
        System.out.println("--------------");
        
        x = false;
        y = false;
        System.out.println(xorOne());
        System.out.println(xorTwo());
        System.out.println(xorThree());
        System.out.println("--------------");
        
    }
    
    public static boolean xorOne()
    {
        if(x != y)
            return true;
        else
            return false;
    }
    
    public static boolean xorTwo()
    {
        if(x && y)
            return false;
        else if(x || y)
            return true;
        else
            return false;
    }
    
    public static boolean xorThree()
    {
        if(x || y)
            if(x == y)
                return false;
            else
                return true;
        else
            return false;
    }
}
