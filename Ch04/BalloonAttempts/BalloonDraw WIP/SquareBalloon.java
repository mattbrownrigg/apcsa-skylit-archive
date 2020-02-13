/**
 * Represents a balloon in the BalloonDraw program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.Color;
import java.awt.Graphics;

public class SquareBalloon extends Balloon
{

  /**
   * Constructs a balloon with the center at (0, 0),
   * radius 50, and blue color
   */
  public SquareBalloon()
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
  public SquareBalloon(int x, int y, int r, Color c)
  {
      super(x, y, r, c);
  }
    public double distance(int x, int y)
  {
    double dx = x - getX();
    dx *=2;
    double dy = y - getY();
    dy *=2;
    return Math.sqrt(Math.max(Math.abs((dx*dx)), (dy*dy)));
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
      g.fillRect(getX() - getRadius() / 2,
                 getY() - getRadius() / 2, this.getRadius(), this.getRadius());
    else
      g.drawRect(getX() - getRadius() / 2,
                 getY() - getRadius() / 2, this.getRadius(), this.getRadius());
    g.setColor(Color.WHITE);             
    if (makeItFilled)
      g.fillOval(getX() , //Radius fixes Oval Problem
                 getY() , 5, 5);                  
           
  }
}
