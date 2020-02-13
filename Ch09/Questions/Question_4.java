
/**
 * Write a description of class Question_4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question_4
{
    public static void main(String[] args)
    {
        char[] hello = {' ', 'h', 'e', 'l', 'l', 'o'};
        
        int i = 1;
        
        while(i < 6)
        {
            hello[i-1] = hello[i];
            i++;
        }
        
        hello[5] = '!';
        
        System.out.print(hello[0]);
        System.out.print(hello[1]);
        System.out.print(hello[2]);
        System.out.print(hello[3]);
        System.out.print(hello[4]);
        System.out.print(hello[5]);
        //System.out.print(hello[6]);
    }
}
