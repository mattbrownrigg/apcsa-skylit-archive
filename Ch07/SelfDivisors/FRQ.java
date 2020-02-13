
/**
 * Write a description of class FRQ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FRQ
{
    public static void main(String[] args)
    {
        printNums(5, 4);
    }
    public static void printNums(int value, int numRounds)
    {
        for(int i = 0; i < numRounds; i++)
        {
            int check = 0;
            while(check != numRounds)
            {
                check = (int)(Math.random()*9);
                System.out.print(check);
            }
            System.out.println();
        }
    }
}
