
/**
 * Write a description of class Sum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sum
{
    public static void main(String[] args)
    {
        double sum = 0.0;
        
        for(int i = 0; i <= 10; i++)
        {
            for(int ii = 0; ii <= 10; ii+= 2)
            {
                for(int iii = 0; iii <= 10; iii+= 3)
                {
                    sum++;
                    //System.out.println(true);
                }
                sum++;
                //System.out.println(true);
            }
        }
        System.out.println(sum);
    }
}
