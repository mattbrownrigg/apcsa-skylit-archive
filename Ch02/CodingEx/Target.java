// Chapter 2 Question 15 (a)

/**
 * This program displays a red cross on a white
 * background.
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Target extends JPanel
{
  public void paintComponent(Graphics g) 
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.RED);
    g.setColor(Color.RED);
    g.fillOval(xCenter - 30, yCenter - 30, 50, 50); //Back Circle
    
    g.setColor(Color.WHITE); //Invisible Circle
    g.fillOval(xCenter -20, yCenter - 20, 30, 30);
    
    g.setColor(Color.RED);
    g.fillOval(xCenter -10 , yCenter - 10, 10, 10); // Bull's Eye
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Target");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Target panel = new Target();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}

