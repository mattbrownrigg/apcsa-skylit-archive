
/**
 * Write a description of class NumFive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumFive
{
    public static void main(String[] args)
    {
        
        String ccNumber = "4111 1945 1812 1776";
        
        String last4 = ccNumber.substring(ccNumber.length() -4, 
                                          ccNumber.length());
        System.out.println(last4);
        
        String last5 = ccNumber.trim();
        last5 = ccNumber.charAt(ccNumber.length() -6) 
                                + ccNumber.substring(ccNumber.length() -4, 
                                                     ccNumber.length());
                                                     
        System.out.print(last5);
        
    }
    
    /*
    public static in last4(String str)
    {
        
    }
    
    
    public static boolean isBTrue(String str)
    {
           
    }
    */
}
