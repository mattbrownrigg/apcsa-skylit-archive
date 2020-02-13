
/**
 * Write a description of class Sum_Digits_Revised here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Sum_Digits_Revised
{
    
    public static void main(String[] args)
    {
            Scanner kb = new Scanner(System.in);
            System.out.println("--------------------------------------------------------");
            System.out.println("This program will add all digits M. ");
            System.out.print("Please type in any positive number. ");
            System.out.println("(Must be Above 0)");
            System.out.print("M = ");
            int m = kb.nextInt();
            kb.close();
            System.out.println("The summation: " + sumDigits(m));
    }
    
        public static int sumDigits(int m)
    {
        int sum = 0;
        
        while(m != 0)
        {
            sum+= m % 10;
            m /= 10;
        }
            
        return sum;
    }
}
