package Ch02.CodingEx;
/**
 * Write a description of class PThirteen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class PThirteen
{
   public static void main(String args[])
   {
       Scanner keytext = new Scanner(System.in);
       
       System.out.println("I am professional robot, I will double a number of your choosing");
       
       int choice = keytext.nextInt();
       
       System.out.println(Integer.toString(choice) + " * 2 = " + Integer.toString(choice * 2));

       keytext.close();
   }
}
