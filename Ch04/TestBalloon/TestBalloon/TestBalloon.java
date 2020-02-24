package Ch04.TestBalloon.TestBalloon;

/**
 * Write a description of class TestBalloon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.Color;

public class TestBalloon
{
    public static void main(String[] args)
    {
        
        //Intialize Balloon "greenie"
        Balloon greenie = new Balloon(50, 100, 30, Color.GREEN); 
        
        //greenie debug
        System.out.println("x = " + greenie.getX());
        System.out.println("y = " + greenie.getY());
        System.out.println("radius = " + greenie.getRadius());
        
        //move command
        greenie.move(60, 110);
        
        //debub move
        System.out.println("x = " + greenie.getX());
        System.out.println("y = " + greenie.getY());
        
        //border var
        boolean onBorder = greenie.isOnBorder(81, 131);
        
        //border debug
        System.out.println("(81, 131) is on the border: " + onBorder);
       
    }
}
