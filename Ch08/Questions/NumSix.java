
/**
 * Write a description of class NumSix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumSix
{
    public static void main(String[] args)
    {
        System.out.println(scroll("Le Festin"));
    }
    
    public static String scroll(String str)
    {
        String res = str.substring(1, str.length()) + str.charAt(0);
        return res;
    }
}
