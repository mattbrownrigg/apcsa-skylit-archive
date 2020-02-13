
/**
 * Write a description of class NumTwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumTwo
{
    public static void main(String[] args)
    {
        
        System.out.println(isATrue("Hello*"));
        System.out.println(isATrue("hi"));
        System.out.println(isATrue("*"));
        
        System.out.println();
        
        System.out.println(isBTrue("Hello*"));
        System.out.println(isBTrue("Hello**"));
        System.out.println(isBTrue("hi"));
        System.out.println(isBTrue("**"));
        System.out.println(isBTrue("*"));
        
    }
    
    public static boolean isATrue(String str)
    {
        String s1 = "";
        if(str != s1 && str.charAt(str.length()-1) == '*')
            return true;
        return false;
    }
    
    
    public static boolean isBTrue(String str)
    {
        if(str.length() >= 2 && str.charAt(str.length()-1) == '*' && 
           str.charAt(str.length()-2) == '*')
                return true;
        return false;    
    }
    
}
