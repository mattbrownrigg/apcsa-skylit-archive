
/**
 * Write a description of class Coins here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coins
{
    private double total;
    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;
    
    public static void main(String[] args)
    {   
        Coins myWallet = new Coins(0.97);        
        System.out.println(myWallet);
        
        System.out.println();
        
        Coins myWallet2 = new Coins(0.12);        
        System.out.println(myWallet2);
        
    }
    
    public Coins(double cents)
    {
        this.total = cents;
        
        for(int i = 1; cents > 0.25; i++)
        {
            cents -= 0.25;
            this.quarters = i;
        }
        
        for(int i = 1; cents > 0.10; i++)
        {
            cents -= 0.10;
            this.dimes = i;
        }
            
        for(int i = 1; cents > 0.05; i++)
        {
            cents -= 0.05;
            this.nickels = i;
        }
        
        for(int i = 1; cents > 0.00; i++)
        {
            cents -= 0.01;
            this.pennies = i;
        }
            
    }
    
    public double getTotal()
    {
        return this.total;
    }
    
    public int getQuarters()
    {
        return this.quarters;
    }
    
    public int getDimes()
    {
        return this.dimes;
    }
    
    public int getNickels()
    {
        return this.nickels;
    }
    
    public int getPennies()
    {
        return this.pennies;
    }
    
    public String toString()
    {
        return "\n" + getTotal() + " makes up: " +
                "\n" + "Quarters: " + getQuarters() +
                "\n" + "Dimes: " + getDimes() +
                "\n" + "Nickels: " + getNickels() +
                "\n" + "Pennies: " + getPennies();
    }
}
