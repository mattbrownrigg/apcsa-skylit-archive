
/**
 * Write a description of class ApproximateLog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ApproximateLog
{
    private static final int N = 10000;
    public static void main(String[] args)
    {
        double sum = 0;
        double k;
        for (k = 1; k <= N; k++)
        {
            if(k%2 == 0)
                sum -= 1.0/k;
            else
                sum += 1.0/k;
        }
        if(k%2 == 0)
            sum += 1.0/k;
        if(k%2 != 0)
            sum -= 1.0/k;
        System.out.println("Log(2) = " + Math.log(2) +
                           "; Sum approximation = " + sum);
    } 
}
