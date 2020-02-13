
/**
 * Write a description of class HelloNTimes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class HelloNTimes
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter a positive Integer: ");
        int n = kb.nextInt();
        kb.nextLine();
        
        System.out.print("Enter a line of text: ");
        String text = kb.nextLine();
        kb.close();
        
        for(int k = 0; k < n; k++)
            System.out.println(text);
    }
}
