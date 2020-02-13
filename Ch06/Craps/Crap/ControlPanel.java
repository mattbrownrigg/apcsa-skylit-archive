// Represents a control panel for a craps "table"

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JButton;

public class ControlPanel extends JPanel
    implements ActionListener
{
  private CrapsTable table;

  // Constructor
  public ControlPanel(CrapsTable t)
  {
    table = t;
    JButton rollButton = new JButton("Roll");
    rollButton.addActionListener(this);
    add(rollButton);
  }

  // Called when the roll button is clicked
  public void actionPerformed(ActionEvent e)
  {
    if (!table.diceAreRolling())
      table.rollDice();
  }
}
