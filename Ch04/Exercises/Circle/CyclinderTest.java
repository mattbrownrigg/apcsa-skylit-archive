
/**
 * Write a description of class CyclinderTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class CyclinderTest
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        
        System.out.println("Please enter a radius");
        int r = kboard.nextInt();
        System.out.println("Please enter a height");
        int h = kboard.nextInt();
        
        //System.out.println(r);
        
        Cylinder pCylinder = new Cylinder(r, h);
        
        System.out.println("Your volume is: " + pCylinder.getVolume());
        
        
    }
    
}
