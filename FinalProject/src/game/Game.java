//Matthew Meyers

package game;

import java.util.*; 
import java.util.Timer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;


// TODO: Auto-generated Javadoc
/**
 * The Class Game.
 * 
 * Swing GUI that contains 24 card game. 
 * This contains the bulk of game functions besides the calculator (BinOperation +), log writer (Writer), and 24 generator (Check) 
 * 
 * @author Matthew Meyers
 * @since 12/02/16
 * @version 1.0
 */

public class Game extends JFrame {
	
	private static final long serialVersionUID = -7296793842990203651L;
	int time;
	int c1;
	int c2;
	int c3;
	int c4;
	int suit1;
	int suit2;
	int suit3;
	int suit4;
	String[] userarray = new String[4];
	String[] match = new String[4];
	JLabel Card1 = new JLabel();
	JLabel Card2 = new JLabel();
	JLabel Card3 = new JLabel();
	JLabel Card4 = new JLabel();
	JLabel TimerLabel = new JLabel();
	JLabel jtextInfo = new JLabel();
	JTextField jtextYouTube = new JTextField("https://www.youtube.com/watch?v=mqFQMFvRurI");
	JTextField jtextUML = new JTextField("http://i.imgur.com/BHe2M12.jpg");
	JTextField jtextExpression = new JTextField(10);
	JTextField jtextSolution = new JTextField(10);
	JButton jbutVerify = new JButton("Verify");
	JButton jbutRefresh = new JButton("Refresh");
	JButton jbutSolution = new JButton("Find a Solution");
	JButton jbutInfo = new JButton("Game Info");
	ImageIcon[] cardIcons = new ImageIcon[5];
	ImageIcon Ace = new ImageIcon();
	JPanel panel1 = new JPanel();
	JPanel panelInfo = new JPanel(new BorderLayout());
	
	
	/**
	 * Instantiates a new game.
	 */
	public Game() {

		
		JPanel panel2 = new JPanel(new BorderLayout());
		panel2.add(new JLabel("Enter an expression: "), BorderLayout.WEST);
		panel2.add(jtextExpression, BorderLayout.CENTER);
		panel2.add(jbutVerify, BorderLayout.EAST);
		panel2.add(jbutInfo, BorderLayout.WEST);
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
		panelInfo.add(jtextInfo, BorderLayout.NORTH);
		panelInfo.add(jtextYouTube, BorderLayout.CENTER);
		panelInfo.add(jtextUML, BorderLayout.SOUTH);
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
		Ace = new ImageIcon(new ImageIcon("pics/1_of_spades.png").getImage()
				.getScaledInstance(179, 250, Image.SCALE_SMOOTH));
		
		// Clears log at start
		Writer.clearFile();

		
		//Focuses on bottom text field
		addWindowListener( new WindowAdapter() {
		    public void windowOpened( WindowEvent e ){
		        jtextExpression.requestFocus();
		    }
		}); 
		
		
		// Timer
		Timer t = new Timer();
		t.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				time++;
				TimerLabel.setText(time + " seconds");
			}
		}, 1000, 1000);
		TimerLabel.setText(time + " seconds");

		
		// INFO BUTTON ACTION
		jtextInfo.setText("<html><p style=\"width:340px\">"+"Each card represents a number. Aces are 1s, Jacks 11, "
				+ "Queens 12, and Kings 13. You must find a mathematical equation that makes these numbers equal 24 and enter "
				+ "it in the bottom text field. <br>-Hit Verify to see if you are correct.<br>-Hit FindASolution for the computer to "
				+ "find one for you. <br>-Hit Refresh to get a new set of cards. <br><br> When typing an equation, remember "
				+ "your order of operations, and please enter paranthetical equations in the format (x+y)+(x+z) <br><br>"
				+ "A log file located inside the Project folder will record your actvity and reset every new game.<br<br>"
				+ "Below are links to a youtube tutorial and a UML diagram, copy and paste them into your browser"+"</p></html>");
		jbutInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, panelInfo, "Game Info", JOptionPane.INFORMATION_MESSAGE, Ace);
			}
		});
		
		
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

			//Makes sure user input matches cards
				int matchfail = 0;
				int matchsuccess = 0;
				int i = 0;
				match[0] = "0";
				match[1] = "0";
				match[2] = "0";
				match[3] = "0";
				userarray[0] = Integer.toString(c1);
				userarray[1] = Integer.toString(c2);
				userarray[2] = Integer.toString(c3);
				userarray[3] = Integer.toString(c4);
				String pattern = "[0-9]+";
				Pattern p = Pattern.compile(pattern);
				Matcher m = p.matcher(userexp);
				while (m.find()) {
					match[i] = (m.group());
					i++;
				}
				for (i = 0; i < 4; i++) {
					if (!Arrays.asList(match).contains(userarray[i])) {
						matchfail++;
					}
				}
				if (matchfail == 0) {
					matchsuccess = 1;
				}

				// Checks if 24
				String error = "";
				if (matchsuccess == 1) {
					if (EvaluateArithmeticExpParanthesis.processExpression(userexp) == 24) {
						type = "VerifyTrue";
					} else {
						type = "VerifyFalse";
					}
				} else {
					type = "VerifyError";
					error = "\n ERROR, YOUR NUMBERS DO NOT MATCH CARDS";
				}
				Writer.appendToFile(time, type, userexp);
				if (type == "VerifyError") {
					JOptionPane.showMessageDialog(null,
							"Your answer is..." + EvaluateArithmeticExpParanthesis.processExpression(userexp) + error,
							"Verify ERROR", JOptionPane.WARNING_MESSAGE);
				} else if (type == "VerifyTrue") {
					JOptionPane.showMessageDialog(null,
							"Your answer is..." + EvaluateArithmeticExpParanthesis.processExpression(userexp) + "\nCorrect!",
							"Verify", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null,
							"Your answer is..." + EvaluateArithmeticExpParanthesis.processExpression(userexp) + "\nIncorrect...",
							"Verify", JOptionPane.INFORMATION_MESSAGE);
				}
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

	
	/**
	 * Refresh.
	 * 
	 * Action upon hitting the refresh button
	 * 4 new cards/numbers are generated
	 */
	private void refresh() {

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
		cardIcons[1] = new ImageIcon(new ImageIcon("pics/" + c1 + "_of_" + suit + ".png").getImage()
				.getScaledInstance(98, 140, Image.SCALE_SMOOTH));
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
				.getScaledInstance(98, 140, Image.SCALE_SMOOTH));
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
				.getScaledInstance(98, 140, Image.SCALE_SMOOTH));
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
				.getScaledInstance(98, 140, Image.SCALE_SMOOTH));
		;
		Card4.setIcon(cardIcons[4]);	
	
	}


	/**
	 * The main method.
	 * Runs Game
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Game();
			}
		});
	}
}