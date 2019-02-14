//Matthew Meyers
//Last modified 11/21/16

package test;

import java.util.*;
import java.util.Timer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import test.*;

public class Game extends JFrame {
	int time;
	int c1;
	int c2;
	int c3;
	int c4;
	int suit1;
	int suit2;
	int suit3;
	int suit4;
	
	int[] userarray = new int[4];
	int[] match = new int[4];

	
	JLabel Card1 = new JLabel();
	JLabel Card2 = new JLabel();
	JLabel Card3 = new JLabel();
	JLabel Card4 = new JLabel();
	JLabel TimerLabel = new JLabel();
	JTextField jtextExpression = new JTextField(10);
	JTextField jtextSolution = new JTextField(10);
	JButton jbutVerify = new JButton("Verify");
	JButton jbutRefresh = new JButton("Refresh");
	JButton jbutSolution = new JButton("Find a Solution");
	ImageIcon[] cardIcons = new ImageIcon[5];
	JPanel panel1 = new JPanel();

	public Game() {

		// GUI
		JPanel panel2 = new JPanel(new BorderLayout());
		panel2.add(new JLabel("Enter an expression: "), BorderLayout.WEST);
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
		panel2.add(TimerLabel, BorderLayout.SOUTH);
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		add(panel3, BorderLayout.NORTH);
		refresh();
		setSize(490, 290);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		jtextSolution.setEditable(false);

		Border emptyborder1, emptyborder2;
		emptyborder1 = BorderFactory.createEmptyBorder(5, 11, 11, 11);
		emptyborder2 = BorderFactory.createEmptyBorder(15, 5, 1, 1);
		getRootPane().setBorder(emptyborder1);
		panel1.setBorder(emptyborder2);

		// --
	
		
		
		Writer.clearFile();

		// Timer
		Timer t = new Timer();
		t.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				time++;
				//System.out.println(time);
				TimerLabel.setText(time + " seconds");

			}
		}, 1000, 1000);
		TimerLabel.setText(time + " seconds");

		// REFRESH BUTTON ACTION
		jbutRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Writer.appendToFile(time, "Refresh", " ");
				refresh();
				time = 0;
				jtextSolution.setText("");
			}
		});

		// VERIFY BUTTON ACTION
		jbutVerify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String type;
				String userexp = jtextExpression.getText();
				
				
				userarray[0] = c1;
				userarray[1] = c2;
				userarray[2] = c3;
				userarray[3] = c4;
				String pattern = "[0-9]+";
				Pattern p = Pattern.compile(pattern);
				Matcher m = p.matcher(userexp);
				int i = 0;
				while (m.find()){
					match[i]=Integer.valueOf(m.group());
					i++;
					//System.out.println(m.group());
				}
				//for (i=0;i<4;i++){
					if (Arrays.asList(match).contains(c1)) {
						System.out.println("success");
					}
					
					for (i=0;i<4;i++){
					System.out.println(userarray[i]);}
			//	}
					
					
					
				if (EvaluateArithmeticExpParanthesis.processExpression(userexp) == 24) {
					type = "VerifyTrue";
				} else {
					type = "VerifyFalse";
				}
				Writer.appendToFile(time, type, userexp);
				JOptionPane.showMessageDialog(null,
						"Your answer is..." + EvaluateArithmeticExpParanthesis.processExpression(userexp));
			}
		});

		// SOLUTION BUTTON ACTION
		jbutSolution.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Writer.appendToFile(time, "FindASolution", Check.checkAnswer(new int[]{c1,c2,c3,c4}));
				JOptionPane.showMessageDialog(null, "The solution is... " + Check.checkAnswer(new int[]{c1,c2,c3,c4}));

				jtextSolution.setText(Check.checkAnswer(new int[]{c1,c2,c3,c4}));
			}
		});

	}

	private void refresh() {
		// ***NEVERMIND*** this unless we use buffimg instead of icons
		// BufferedImage wPic =
		// ImageIO.read(this.getClass().getResource("card1.png"));
		// JLabel wIcon = new JLabel(new ImageIcon(wPic));

		// x will need to be a random value. There will be 3 other variables. I
		// have it set like this for now so we can see test icons

		int y = 1;
		String suit;

		c1 = 1 + (int) (Math.random() * 13);
		y = 1 + (int) (Math.random() * 4);
		if (y == 1) {
			suit = "diamonds";
		} else if (y == 2) {
			suit = "hearts";
		} else if (y == 3) {
			suit = "spades";
		} else {
			suit = "clubs";
		}
		// System.out.println(c1 + "and" + y);
		cardIcons[1] = new ImageIcon(new ImageIcon("pics/" + c1 + "_of_" + suit + ".png").getImage()
				.getScaledInstance(98, 140, Image.SCALE_DEFAULT));
		;
		Card1.setIcon(cardIcons[1]);

		c2 = 1 + (int) (Math.random() * 13);
		y = 1 + (int) (Math.random() * 4);
		if (y == 1) {
			suit = "diamonds";
		} else if (y == 2) {
			suit = "hearts";
		} else if (y == 3) {
			suit = "spades";
		} else {
			suit = "clubs";
		}
		cardIcons[2] = new ImageIcon(new ImageIcon("pics/" + c2 + "_of_" + suit + ".png").getImage()
				.getScaledInstance(98, 140, Image.SCALE_DEFAULT));
		;
		Card2.setIcon(cardIcons[2]);

		c3 = 1 + (int) (Math.random() * 13);
		y = 1 + (int) (Math.random() * 4);
		if (y == 1) {
			suit = "diamonds";
		} else if (y == 2) {
			suit = "hearts";
		} else if (y == 3) {
			suit = "spades";
		} else {
			suit = "clubs";
		}
		cardIcons[3] = new ImageIcon(new ImageIcon("pics/" + c3 + "_of_" + suit + ".png").getImage()
				.getScaledInstance(98, 140, Image.SCALE_DEFAULT));
		;
		Card3.setIcon(cardIcons[3]);

		c4 = 1 + (int) (Math.random() * 13);
		y = 1 + (int) (Math.random() * 4);
		if (y == 1) {
			suit = "diamonds";
		} else if (y == 2) {
			suit = "hearts";
		} else if (y == 3) {
			suit = "spades";
		} else {
			suit = "clubs";
		}
		cardIcons[4] = new ImageIcon(new ImageIcon("pics/" + c4 + "_of_" + suit + ".png").getImage()
				.getScaledInstance(98, 140, Image.SCALE_DEFAULT));
		;
		Card4.setIcon(cardIcons[4]);	
	
	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Game();
			}
		});
	}
}