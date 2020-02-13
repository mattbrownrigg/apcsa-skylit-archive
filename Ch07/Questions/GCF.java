
/**
 * Write a description of class GCF here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GCF
{
    
    public static void main(String[] args)
    {
        
        System.out.print("\n");
        divide(30, 45);
    }
    public static void divide(int a, int b) {//start of your method

        int temp;
        // making a greater than b
        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }

        while (b !=0) {
            // gcd of b and a%b
            temp = a%b;
            // always make a greater than b
            a =b;
            b =temp;

        }
        System.out.println(a);
    }
    
    public static int gcd(int a, int b) {
        if (b==0) 
            return a;
        return gcd(b,a%b);
    }
}
