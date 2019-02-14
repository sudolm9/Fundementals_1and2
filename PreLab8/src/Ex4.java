import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Ex4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Bullseye");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 BullseyePanel panel = new BullseyePanel();
		 frame.getContentPane().add(panel);
		 frame.pack();
		 frame.setVisible(true);
		 }
		}
		class BullseyePanel extends JPanel
		{
		 private final int MAX_WIDTH = 300, NUM_RINGS = 5, RING_WIDTH = 25;
		 //-----------------------------------------------------------------
		 // Sets up the bullseye panel.
		 //-----------------------------------------------------------------
		 public BullseyePanel()
		 {
		 setBackground(Color.cyan);
		 setPreferredSize(new Dimension(300,300));
		 }
		public void paintComponent(Graphics page)
		 {
		 super.paintComponent (page);
		 int x = 0, y = 0, diameter = MAX_WIDTH;
		 page.setColor(Color.white);
		 for (int count = 0; count < NUM_RINGS; count++)
		 {
		 if (page.getColor() == Color.black) // alternate colors
		 page.setColor(Color.white);
		 else
		 page.setColor( Color.black);
		 page.fillOval(x, y, diameter, diameter);
		 diameter -= (2 * RING_WIDTH);
		 x += RING_WIDTH;
		 y += RING_WIDTH;
		 }
		 // Draw the red bullseye in the center
		 page.setColor(Color.red);
		 page.fillOval(x, y, diameter, diameter);

	}

}
