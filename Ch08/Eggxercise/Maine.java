
/**
 * Write a description of class Maine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Maine
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        boolean endProgram = false;
        
        System.out.println("Hello and welcome to User Friendliness OS™ v0.75");
        System.out.println("The GUI is out of order right now, ");
        System.out.println("so please type your desired method to the" 
                            + " corresponding number");
                            
        System.out.println("\n" + "removeDashes - 3");
        System.out.println("convertName - 7");
        System.out.println("BitFlip - 8");
        System.out.println("indexOf - 12");
        System.out.println("isOnlyDigits - 15");
        System.out.println("isPalindrome - 18");
        
        do
        {
            System.out.print("\n" + "Which you would like to choose: ");
            int playerChoice = kb.nextInt();
            kb.nextLine();
            
            System.out.println("--------------------------------------------");
            
            if(playerChoice == 3)
            {
                System.out.println("\n" + "Welcome to Social Security Dash"
                                    + " Remover™!");
                System.out.println("Ex. ###-##-####");                    
                System.out.print("Please safely type in your SSN: ");
                
                //kb.nextLine();
                String SSN = kb.nextLine();
                
                System.out.println("\n" + "Processing...");
                System.out.println("Your new SSN is: " + removeDashes(SSN));
                
                
            }
            
            else if(playerChoice == 7)
            {
                System.out.println("\n" + "Welcome to Name Displacer™!");
                System.out.println("Ex. \"von Neumann, John\"");                    
                System.out.print("Please type in your Undisplaced Name: ");
                
                //kb.nextLine();
                String name = kb.nextLine();
                
                System.out.println("\n" + "Processing...");
                System.out.println("Your Displaced Name is: " + convertName(name));
                
                
            }
            
            else if(playerChoice == 8)
            {
                System.out.println("\n" + "Welcome to BitFlip™!");
                System.out.println("Ex. 101010101010");                    
                System.out.print("Please type in your numbers: ");
                
                //kb.nextLine();
                String bits = kb.nextLine();
                
                System.out.println("\n" + "Processing...");
                System.out.println("Your flipped bits: " + oneZero(bits));
                
                
            }
            
            else if(playerChoice == 12)
            {
                System.out.println("\n" + "Welcome to indexOf!");
                System.out.println("Ex. [String], searchword, StartPos");                    
                System.out.print("Please type in your unsure String: ");
                
                //kb.nextLine();
                String str = kb.nextLine();
                //kb.nextLine();
                
                System.out.print("Please type in your desired search word: ");
                
                String s = kb.nextLine();
                char ch = s.charAt(0);
                
                System.out.print("Please type in your desired start point: ");
                
                int fromPos = kb.nextInt();
                kb.nextLine();
                
                System.out.println("\n" + "Processing...");
                System.out.println("Your desired search word is at: " + takeIndexOf(str, ch, fromPos));
            }
            
            else if(playerChoice == 15)
            {
                System.out.println("\n" + "Welcome to Only Digit Finder™!");
                System.out.println("Ex. [Number] or [String] or [both]");                    
                System.out.print("Please type in your unknown number: ");
                
                //kb.nextLine();
                String rand = kb.nextLine();
                
                System.out.println("\n" + "Processing...");
                System.out.println("Does your String only have numbers: " + isOnlyDigits(rand));
                
                
            }
            
            else if(playerChoice == 18)
            {
                System.out.println("\n" + "Welcome to isPalindrome™!");
                System.out.println("Ex. [Word]");                    
                System.out.print("Please type in your unknown phrase: ");
                
                //kb.nextLine();
                String palindrome = kb.nextLine();
                
                System.out.println("\n" + "Processing...");
                System.out.println("Is your phrase a palindrome: " + isPalindrome(palindrome));
                
                
            }
            
            else
            {
                System.out.println("Please type a valid Number." + "\n");
            }
            boolean gate = true;
            do
            {
                System.out.println("--------------------------------------------");
                System.out.print("\n" + "Would you like to continue?" + "(Yes/No): ");
                String playerRes = kb.nextLine();
                
                if(playerRes.equalsIgnoreCase("Yes"))
                {
                    endProgram = false;
                    gate = false;
                }
                else if(playerRes.equalsIgnoreCase("No"))
                {
                    gate = false;
                    endProgram = true;
                }
                else
                {
                    System.out.println("Please type in Yes or No: ");
                }
            }while(gate);
            //System.out.println(removeDashes("177-65-4321"));
        } while(!(endProgram));
        System.out.println("\n" + "--------------------------------------------");
        System.out.println();
        System.out.println("Thank you for using User Friendliness OS™ v0.7");
    }
    
    public static String removeDashes(String str)
    {
        String res = "";
        int firstDash = str.indexOf('-');
        int lastDash = str.lastIndexOf('-');
        
        res = str.substring(0, firstDash) + str.substring(firstDash + 1, lastDash) 
              + str.substring(lastDash + 1);
              
        return res;
          
    }
    
    public static String convertName(String str)
    {
        String res = "";
        res = str.substring(str.lastIndexOf(',') + 2, str.length()) + " " 
                            + str.substring(0, str.indexOf(','));
        res = res.trim();
        
        return res;
        
    }
    
    
    public static String oneZero(String str)
    {
        String res = "";
        
        res = str.replace('1', '2');
        //System.out.println(res);
        res = res.replace('0', '1');
        //System.out.println(res);
        res = res.replace('2', '0');
        //System.out.println(res);
        
        return res;
        
    }
    
   public static int takeIndexOf(String str, char ch, int fromPos)
   {
       
       int counter = fromPos;
       for(int i = fromPos; i < str.length()-1; i++)
       {
           if(ch == str.charAt(i))
           {
               return counter;
           }
           counter++;
       }
       return -1;
   }
   
   public static boolean isOnlyDigits(String str)
   {
       String res = "";
       try
       {
           int n = Integer.parseInt(str);
       }
       catch (NumberFormatException ex)
       {
           return false;
       }
       finally
       {
           //System.out.println("Your number is only an int.");
       }
       return true;
   }
   
   public static boolean isPalindrome(String word)
   {
       String drow = "";
       String str = "";
       char apos = ' ';
       char wrod = ' ';
       
       for(int p = 0; p < word.length(); p++)
       {
           wrod = word.charAt(p);
           if(Character.isLetterOrDigit(wrod))
           {
               str += word.charAt(p);
               //System.out.println(str);
           }
       }
       System.out.println(str);
       for(int i = word.length() - 1; i >= 0; i--)
       {
           apos = word.charAt(i);
           if(Character.isLetterOrDigit(apos))
           {
               drow += word.charAt(i);
           }
       }
       System.out.println(drow);
       System.out.println();
       
       if(str.equalsIgnoreCase(drow))
       {
           return true;
       }
           
       return false;
   }
}
