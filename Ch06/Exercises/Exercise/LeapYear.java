
/**
 * Write a description of class LeapYear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LeapYear
{
    public static void main(String[] args)
    {
        System.out.println("2000 " + isLeapYear(2000));
        System.out.println("2001 " + isLeapYear(2001));
        System.out.println("2004 " + isLeapYear(2004));
    }
    
    public static boolean isLeapYear(int year)
    {
        if((year % 4 == 0) &&( (year % 100 != 0) || (year % 400 == 0)))
            return true;
        else
            return false;
    }
}
