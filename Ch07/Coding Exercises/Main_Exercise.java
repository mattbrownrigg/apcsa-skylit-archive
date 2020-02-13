

/**
 * Write a description of class Main_Exercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Main_Exercise
{
    static int choice;
    public static void main(String[] args)
    {
        System.out.println("Howdy and Welcome to the all inclusive" 
                            + " User-Friendly Program™");
        //System.out.println("\n");
        System.out.print("           __________                                      ");
        System.out.print("          .'----------`.                                 \n");
        System.out.print("          | .--------. |                                 \n");
        System.out.print("          | |########| |       __________                \n");
        System.out.print("          | |########| |      /__________/                \n");
        System.out.print(" .--------| `--------' |------|    --=-- |-------------. \n");
        System.out.print(" |        `----,-.-----'      |o ======  |             | \n");
        System.out.print(" |       ______|_|_______     |__________|             | \n");
        System.out.print(" |      /  %%%%%%%%%%%%  /                              | \n");
        System.out.print(" |     /  %%%%%%%%%%%%%%  /                             | \n");
        System.out.print(" |     ^^^^^^^^^^^^^^^^^^^^                            | \n");
        System.out.print(" +-----------------------------------------------------+ \n");
        System.out.print(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ \n");
        Scanner kb = new Scanner(System.in);
        System.out.println("Please type in a corresponding method"); 
        System.out.println("/ 3 - Multiply / 4 - Divide / ✓ \n"
                            + "/ 6 - Population / 8 - Add Odds / ✓ \n"
                            + "/ 12 - Sum Digits / 20 - Star Triangle / ✓ \n"
                            + "/ 24 - Dialog / ✓ ");
        choice = kb.nextInt();
        
        if(choice == 3)
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("Please type in two factors");
            System.out.print("Factor 1: ");
            int oneFac = kb.nextInt();
            System.out.print("Factor 2: ");
            int twoFac = kb.nextInt();
            kb.close();
            System.out.println("The result: " + product(oneFac, twoFac));
        }
            
        if(choice == 4)
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("Please type in two numbers two divide.");
            System.out.print("Divended 1: ");
            int m = kb.nextInt();
            System.out.print("Divisor 2: ");
            int n = kb.nextInt();
            kb.close();
            System.out.println("The result: " + divide(m, n));
        }
        
        if(choice == 6)
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("The population of Mexico was 123.8 million in 2014. ");
            System.out.print("Please type in the your target population. ");
            System.out.println("(Must be Above 123.8)");
            System.out.print("Target: ");
            int target = kb.nextInt();
            kb.close();
            System.out.println("The result: " + population(target));
        }
        
        if(choice == 8)
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("This program will add all odd numbers of n. ");
            System.out.print("Please type in any positive number. ");
            System.out.println("(Must be Above 0)");
            System.out.print("N = ");
            int n = kb.nextInt();
            kb.close();
            System.out.println("The result: " + addOdds(n));
        }
        
        if(choice == 12)
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("This program will add all digits M. ");
            System.out.print("Please type in any positive number. ");
            System.out.println("(Must be Above 0)");
            System.out.print("M = ");
            int m = kb.nextInt();
            kb.close();
            System.out.println("The summation: " + sumDigits(m));
        }
        
        if(choice == 20)
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("This program will make a star triangle with dimesions n. ");
            System.out.print("Please type in any positive number. ");
            System.out.println("(Must be Above 0)");
            System.out.print("N = ");
            int m = kb.nextInt();
            kb.close();
            printStarTri(m);           
        }
        
        if(choice == 24)
        {
            kb.close();
            rippleSystems();
        }
    }
    
    public static int product(int a, int b)
    {
        int product = 0;
        for(int k = 1;k <= a; k++)
        {    
            product += b;
        }
        return product;
    }
    
    public static int divide(int m, int n)
    {
        int q = 0;
        int r = m;
        while (r >= n)
        {
                r -= n;
                q += 1;
        }    
        System.out.println("The remainder is " + r);
        return q;                 
    }
    
    public static String population(double target)
    {
        final double GROWTH_RATE = 1.005;
        final double POP_NUM = 123.8;
        double predicted = POP_NUM;
        int year = 2014;
        
        if(target < 123.8)
            return "Please type a valid target.";
        
        for(year = 2014; predicted < target; year++)
        {
            predicted *= GROWTH_RATE;
        }
        
        return "Mexico will have a population of " + Double.toString(target)
                + " in " + Integer.toString(year);
    }
    
    public static int addOdds(int n)
    {
        int odds = 0;
        
        for(int k = 1; k <= n; k +=2)
        {
            odds += k;
        }
          
        return odds;
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
    
    public static void printStarTriangle(int n)
    {
        for (int row = 1; row <= n; row++)
        {
            int col = 1;
            while (col <= n - row)
            {
                System.out.print(" ");
                col++;
            }
            while (col < n + row)
            {
                System.out.print("*");
                col++; 
            }
            System.out.println();
        }
    }
    
    public static void printStarTri(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            int j = 1;
            while(j <= n-i)
            {
                System.out.print(" ");
                j++;
            }
            
            while(j < n + i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }
    
    public static void rippleSystems()
    {
        boolean isNextCustomer;
        final double PRICE = 0.26;
        char answer;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Welcome to Ripple Systems OS™");
        System.out.println("Now with less abstraction™ \n \n");
            
        
        do {

            System.out.print("Enter quantity: ");
            int quantity = keyboard.nextInt();
            
            if(quantity % 25 == 0)
            {
                System.out.printf("You have ordered %d Ripples -- $%.2f \n \n", quantity, 
                PRICE * quantity);
            }
            else
            {
                System.out.println("Ripples can only be ordered in packs of 25. \n");
            }
            
            System.out.print("Next Customer (y/n): ");
            
            keyboard.nextLine();
            String str = keyboard.nextLine().trim();
            System.out.println("\n");
            
            if(str.length() == 1)
                answer = str.charAt(0);
            else
                answer = ' ';
                
            if(answer == 'y')
                isNextCustomer = true;
            else
            {
                isNextCustomer = false;
                System.out.println("Thank you for using Ripple Systems OS™. Come Again!");
            }
            
        } while(isNextCustomer);
    }
}
