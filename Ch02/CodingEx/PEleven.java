
/**
 * Write a description of class PEleven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PEleven
{
   public static void main(String args[])
   {
       Scanner kboard = new Scanner(System.in);
       System.out.println("What is your favorite Movie?");
       String movie = kboard.nextLine();
       
       System.out.println("I think " + movie + " is a terrible movie!");
       System.out.println("Just Kidding! I like " + movie +" , too.");
       
   }
}
