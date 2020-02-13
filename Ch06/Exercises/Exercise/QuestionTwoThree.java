
/**
 * Write a description of class QuestionTwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuestionTwoThree
{
    public static void main(String[] args)
    {
        System.out.println(max(5, 8, 10));
        
    }
    
    public static int max(int a, int b, int c)
    {
        if(a > b && a > c)
            return a;
        else if(b > a && b > c)
            return b;
        else if(c > a && c > b)
            return c;
        else
            return a;
    }
}
