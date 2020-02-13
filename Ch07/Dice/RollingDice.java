

/**
 * Write a description of class RollingDice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class RollingDice
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Hello and Welcome to User-Friendliness™ v0.06™ \n \n");
        
        System.out.print("How many dice are there? ");
        int playerDice = kb.nextInt();
        System.out.print("\n");
        
        System.out.print("How many times should I roll the die? ");
        int playerRolls = kb.nextInt();
        System.out.print("\n");
        
        
        for(int p = 0; p < playerDice; p++)
        {
            System.out.printf("\n" + "Roll #%d : " + " ", p + 1);
            for(int i = 0; i < playerRolls; i++)
            {
                System.out.print(rollDie() + " ");
            }
        }
        System.out.println("\n \n \n" + "Understandable, Have a Good Day");
    }
    
    public static int rollDie()
    {
        return ((int)(Math.random() * 6) + 1);
    }
}
