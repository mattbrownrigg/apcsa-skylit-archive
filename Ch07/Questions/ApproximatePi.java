
/**
 * Write a description of class ApproximatePi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ApproximatePi
{
    private static final int N = 10000;
    public static void main(String[] args)
    {
        double sum = 0;
        for (int k = 1; k <= N; k++)
            sum += 1.0/(k*k);
        System.out.println("Math.PI^2/6 = " + Math.PI*Math.PI/6 +
                           "; Sum approximation = " + sum);
    } 
}

