package Ch09.Eggersize;

/**
 * Write a description of class Eggersizes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.Scanner;
public class Eggersizes
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int[] testArray = {4, 6, -1, 3, 5};
        double[][] m = 
        {
        {-1, 7, -3},
        {-2, 2, -3},
        {-3, 4, 6}
        };
        
        
        
        System.out.println("Array before: " + Arrays.toString(testArray));
        swapFirstAndLast(testArray);
        System.out.println("Array after swapping first and last: " 
                            + Arrays.toString(testArray));
                            
        int[] rps = new int[3];
        for (int i = 0; i < 1400; i++) {
           switch(getRandomRps()) 
            {
              case 'r':
                 rps[0]++;
                 break;
              case 'p':
                 rps[1]++;
                 break;
              case 's':
                 rps[2]++;
                 break;
            }
        }
        System.out.println("expect 300:500:600 from 1400 calls to getRandomRps(). Got " +
        rps[0] + ":" + rps[1] + ":" + rps[2]);
        
        System.out.println("Please choose a word (Make it all Caps)");
        String playerChoice = kb.nextLine();
        System.out.println(playerChoice + " = " + computeScore(" " + playerChoice));
        
        System.out.println("The max positive is: " + positiveMax(m));

        kb.close();
    }
    
    public static void swapFirstAndLast (int[] swapper)
    {
        int firstTemp = 0;
        int lastTemp = 0;
        lastTemp = swapper[swapper.length-1];
        firstTemp = swapper[0];
        swapper[0] = lastTemp;
        swapper[swapper.length-1] = firstTemp;
    }
    
    public static char getRandomRps()
    {
        char[] proRps = {'r','r','r','p','p','p','p','p','s','s','s','s','s','s'};
        return proRps[(int)((proRps.length) * Math.random())];
    }
    
    public static int computeScore(String word)
    {
        int[] alphabetPoint = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10,
                          1, 1, 1, 1, 4, 4, 8, 4, 10};
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L',
                           'M','N','O','P','Q','R','S','T','U','V','W','X',
                           'Y','Z'};
        int sum = 0;
        String resWord = " " + word;
        for(int i = 0; i < alphabet.length; i++)
        {
            int count = 0;
            
            for(int k = 0; word.indexOf(alphabet[i], k+1) > 0; k = word.indexOf(alphabet[i], k+1))
            {
                count++;
                //System.out.println(count);
            }
            //System.out.println(alphabet[i] + " " + count);
            for(int j = 0; j < count; j++) 
                sum += alphabetPoint[i];
            //System.out.println(sum);
        }
        return sum;
    }
    
    public static double positiveMax(double[][] m)
    {
        double max = 0;
        for(int r = 0; r < m.length; r++)
        {
            for(int c = 0; c < m[0].length; c++)
            {
                if(m[r][c] > max)
                {
                    max = m[r][c];
                }
            }
        }
        return max;
    }
    
}
