//Matthew Meyers
//Last modified 11/21/16

package test;

import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Game extends JFrame {
   JLabel Card1 = new JLabel();
   JLabel Card2 = new JLabel();
   JLabel Card3 = new JLabel();
   JLabel Card4 = new JLabel();
   JTextField jtextExpression = new JTextField(10);
   JTextField jtextSolution = new JTextField(10);
   JButton jbutVerify = new JButton("Verify");
   JButton jbutRefresh = new JButton("Refresh");
   JButton jbutSolution = new JButton("Find a Solution");
   ImageIcon[] cardIcons = new ImageIcon[52];
   JPanel panel1 = new JPanel();


  public Game() {
   JPanel panel2 = new JPanel(new BorderLayout());
   panel2.add(new JLabel("Enter an expression: "),
   BorderLayout.WEST);
   panel2.add(jtextExpression, BorderLayout.CENTER);
   panel2.add(jbutVerify, BorderLayout.EAST);
   JPanel panel3 = new JPanel(new BorderLayout());
   panel3.add(jbutSolution, BorderLayout.WEST);
   panel3.add(jtextSolution, BorderLayout.CENTER);
   panel3.add(jbutRefresh, BorderLayout.EAST);
   panel1.add(Card1);
   panel1.add(Card2);
   panel1.add(Card3);
   panel1.add(Card4);
   add(panel1, BorderLayout.CENTER);
   add(panel2, BorderLayout.SOUTH);
   add(panel3, BorderLayout.NORTH);
   refresh();
   setSize(400, 200);		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);		
	setVisible(true);
	
   //REFRESH BUTTON ACTION
   jbutRefresh.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
   refresh();
   }
   });

   //VERIFY BUTTON ACTION
   jbutVerify.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
	   int x = 1;
   if (x==1) {
   JOptionPane.showMessageDialog(null,
   "test verify");
   }
   }
   });
  }


  private void refresh() {
//***NEVERMIND*** this unless we use buffimg instead of icons
	  //BufferedImage wPic = ImageIO.read(this.getClass().getResource("card1.png"));
	  // JLabel wIcon = new JLabel(new ImageIcon(wPic));
   
   
   //x will need to be a random value. There will be 3 other variables. I have it set like this for now so we can see test icons
   int x = 0;
   cardIcons[x] = new ImageIcon(new ImageIcon("card" + (x + 1) + ".png").getImage().getScaledInstance(75, 100, Image.SCALE_DEFAULT));;
   Card1.setIcon(cardIcons[x]);
   Card2.setIcon(cardIcons[x]);
   Card3.setIcon(cardIcons[x]);
   Card4.setIcon(cardIcons[x]);
  }
  
  

  // RANDOM NUM
  public static int getRandom(int ...numbers) {
   int value = 1 + (int)(Math.random() * 54);
   return value;
   }
  
 
  public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Game();
			}
		});
	}
}