
/**
 * Write a description of class SelfDivide here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelfDivide
{
    public static void main(String[] args) 
    {
        System.out.println(isSelfDivisor(124));
        findSelfDivisor();
    }
    
    public static boolean isSelfDivisor(int num)
    {
        // could be any num this is a randomly generated one
        
        // this will return each number to a int variable
        int num1 = num % 10;
        int num2 = num / 10 % 10;
        int num3 = num / 100 % 10;
        
        if(num1 % num2 == 0 && num1 % num3 == 0)
            return true;
        
        return false;
    }
    
    public static void findSelfDivisor()
    {
        // could be any num this is a randomly generated one
        int count = 0;
        for(int num = 100; count < 10; num++)
        {
            
            int num1 = num % 10;
            int num2 = num / 10 % 10;
            int num3 = num / 100 % 10;
            
            if(num1 == 0)
                continue;
            
            if(num2 == 0)
                continue;
            
            if(num3 == 0)
                continue;
                
            if(num1 % num2 == 0 && num1 % num3 == 0)
            {
                count++;
                System.out.print(num + " ");
            }
            
        }
        
    }
}
