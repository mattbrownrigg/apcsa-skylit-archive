
/**
 * Write a description of class Value here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Value
{
    public static void main(String[] args)
    {
        System.out.println(iteration());
        triIteration();
    }
    
    public static int iteration()
    {
        int sum = 0;
        for(int x = 1; sum < 20 && x <= 5; x++)
            sum += 2 * x;
        return sum;
    }
    
    public static void triIteration()
    {
        int m = 1, n = 1;
        for(m = 2; m <= 10; m++)
        {
            for(n = 1; n <= m; n++)
                if(n * n == m)
                    break;
        }
        System.out.println(m + " " + n);
    }
}


