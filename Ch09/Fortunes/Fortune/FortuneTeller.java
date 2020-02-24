package Ch09.Fortunes.Fortune;

// Fortune Teller

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

import Ch03.Exercises.EasySound;

import javax.swing.JButton;

public class FortuneTeller extends JFrame
    implements ActionListener
{
  private static final EasySound ding = new EasySound("ding.wav");

  // Declare an array of "fortunes" (strings):
  String[] fortunes = {"You will live a long happy life",
                        "A dubious friend may be an enemy in camouflage",
                        "A feather in the hand is better than a bird in the air",
                        "A stranger, is a friend you have not spoken to yet",
                        "The greatest risk is not taking one."}; 

  private JTextField display;
  
  public FortuneTeller()
  {
    super("Fortune Teller");

    display = new JTextField("  Press \"Next\" to see your fortune...", 25);
    display.setBackground(Color.WHITE);
    display.setEditable(false);

    JButton go = new JButton("Next");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(display);
    c.add(go);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    // Pick and display a random fortune:
    String disp = fortunes[(int)(Math.random() * fortunes.length)];

    display.setText(disp);
    ding.play();
  }

  public static void main(String[] args)
  {
    JFrame window = new FortuneTeller();
    window.setBounds(300, 300, 300, 100);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setVisible(true); 
  }
}
