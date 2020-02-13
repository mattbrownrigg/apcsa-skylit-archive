
/**
 * Write a description of class Amicable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Amicable
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Note: 2 <= m < n <= 1000 ");
        System.out.print("Please select a number for m: ");
        
        int m = kb.nextInt();
        int sumM = properSum(m);
        System.out.println("\n" + "Proper Sum is: " + properSum(m));
        
        System.out.print("\n" + "Please select a number for n: ");
        int n = kb.nextInt();
        int sumN = properSum(n);
        System.out.println("\n" + "Proper Sum is: " + properSum(n));
        
        kb.close();
        
        System.out.println();
        System.out.println("Is " + m + " and " + n + " Amicable? "
                            + isAmicable(m, sumN));
    }
    
    public static int properSum(int a)
    {
        int sum = 0;
        for(int d = 1; d <= a/2; d++)
        {
            if(a % d == 0)
            {
                sum += d;
                //System.out.println(d);
            }
        }
        return sum;
    }
    
    public static boolean isAmicable(int m, int sumTwo)
    {
        if(m == sumTwo)
            return true;
        return false;
    }
}
