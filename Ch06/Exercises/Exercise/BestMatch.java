
/**
 * Write a description of class BestMatch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Color;
public class BestMatch
{
    public static void main(String[] args)
    {
        System.out.println(bestMatch(255, 20, 10));
    }
    
    public static Color bestMatch(int r, int g, int b)
    {
        if(r > g && r > b)
            return Color.RED;
        if(g > r && g > b)
            return Color.GREEN;
        if(b > r && b > g)
            return Color.BLUE;
        if(r == g && g == b)
            return Color.GRAY;
        if(g < r && b < r)
            return Color.CYAN;
        if(r > b && g > b)
            return Color.YELLOW;
        if(r > g && b >g)
            return Color.MAGENTA;
        else
            return Color.GRAY;
            
        
    }
}
