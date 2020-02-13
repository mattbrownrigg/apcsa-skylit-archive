
/**
 * Write a description of class Question here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question
{
    public static void main(String[] args)
    {
        int[] init = {1, 2 , 4};
        
        
        System.out.print(init[0]);
        System.out.print(init[1]);
        System.out.println(init[2]);
        
        int sum = 0;
        
        for(int i = 0; i < init.length; i++)
        {
            sum += init[i];
        }
        
        System.out.println(sum);
    }
}
