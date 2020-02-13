/**
 * Represents a balloon in the BalloonDraw program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.Color;
import java.awt.Graphics;

public class FancyBalloon extends Balloon
{
  private int xCenter, yCenter, radius;
  private Color color;

  /**
   * Constructs a balloon with the center at (0, 0),
   * radius 50, and blue color
   */
  public FancyBalloon()
  {
      super();
  }

  /**
   * Constructs a balloon with a given center, radius and color
   * @param x x-coordinate of the center
   * @param y y-coordinate of the center
   * @param r radius of the balloon
   * @param c color of the balloon
   */
  public FancyBalloon(int x, int y, int r, Color c)
  {
      super(x, y, r, c);
  }
  public double distance(int x, int y)
  {
    double dx = x - getX();
    dx *=2;
    double dy = y - getY();
    
    double dx2 = x - getX();
    double dy2 = y - getY();
    dy2 *= 2;
  
    return Math.min(Math.sqrt(dx*dx + dy*dy), Math.sqrt(dx2*dx2 + dy2*dy2));
  }
  /**
   * Draws a solid circle if makeItFilled is true and
   * outline only if makeItFilled is false
   * @param g graphics context
   * @param makeItFilled draws a solid circle if true
   */
  public void draw(Graphics g, boolean makeItFilled)
  {
    g.setColor(getColor());
    if (makeItFilled)
      g.fillOval(getX() - getRadius() / 2, //Radius fixes Oval Problem
                 getY() - getRadius(), this.getRadius(), this.getRadius()*2);
                 
    else
      g.drawOval(getX() - getRadius() / 2,
                 getY() - getRadius(), this.getRadius(), this.getRadius()*2);
    
    if (makeItFilled)
      g.fillOval(getX() - getRadius(), //Radius fixes Oval Problem
                 getY() - getRadius() / 2, this.getRadius()*2, this.getRadius());
                 
    else
      g.drawOval(getX() - getRadius(),
                 getY() - getRadius() / 2, this.getRadius()*2, this.getRadius());
  }
}