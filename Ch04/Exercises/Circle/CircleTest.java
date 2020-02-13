
/**
 * Write a description of class CircleTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        
        System.out.println("Please enter a radius");
        int r = kboard.nextInt();
        
        //System.out.println(r);
        
        Circle pCircle = new Circle(r);
        
        System.out.println("Your area is: " + pCircle.getArea());
        
        
    }
    
}
