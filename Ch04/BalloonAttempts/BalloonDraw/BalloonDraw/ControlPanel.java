/**
 * Control panel in BalloonDraw.
 */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JButton;

public class ControlPanel extends JPanel
{
  private DrawingPanel canvas;
  private JButton colorButton, colorDisplay, balloonButton;

  public ControlPanel(DrawingPanel canvas)
  {
    this.canvas = canvas;

    colorButton = new JButton("Pick Color");
    colorButton.addActionListener(new ColorButtonListener());

    colorDisplay = new JButton();
    colorDisplay.setBackground(canvas.getColor());
    colorDisplay.setEnabled(false);

    balloonButton = new JButton("Add Balloon");
    balloonButton.addActionListener(new BalloonButtonListener());

    add(colorButton);
    add(colorDisplay);
    add(balloonButton);
  }

  private class ColorButtonListener
      implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      canvas.pickColor();
      colorDisplay.setBackground(canvas.getColor());
      canvas.requestFocus();
    }
  }

  private class BalloonButtonListener
      implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      canvas.addBalloon();
      canvas.requestFocus();
    }
  }
}
