import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private String tempVal="";//place to temporarily store first number chosen
	String operation;//Used for the equal operation switch statement

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Maciej's Calculator");
		setBackground(Color.BLACK);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 286);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setForeground(Color.BLACK);
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setText("0");
		textField.setBounds(10, 11, 274, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField.addKeyListener(new KeyListener() { //using numbers on keyboard enabled
			@Override
			public void keyTyped(KeyEvent e) {
				switch(e.getKeyChar()){
				case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9': case '0':
					textField.setText(textField.getText()+e.getKeyChar());break;//filtering the keyboard input to only numbers
				}
		}
			
			
			@Override
			public void keyPressed(KeyEvent arg0) {//not being used, error occurs if deleted, part of KeyListener
			}

			@Override
			public void keyReleased(KeyEvent arg0) {//not being used, error occurs if deleted,part of KeyListener
			}
	});
		ActionListener myActn = new ActionListener() {//action listener for all buttons
			
			public void actionPerformed(ActionEvent e) {
				switch(e.getActionCommand()){
				case "C": textField.setText("0");break;
				case "+": tempVal=textField.getText();textField.setText("0");operation="ADDITION";break;
				case "-": tempVal=textField.getText();textField.setText("0");operation="SUBTRACTION";break;
				case "*": tempVal=textField.getText();textField.setText("0");operation="MULTIPLICATION";break;
				case "/": tempVal=textField.getText();textField.setText("0");operation="DIVISION";break;
				case "1": case "2": case "3": case "4": case "5": case "6": case "7": case "8": case "9": case "0":
					textField.setText(textField.getText().equals("0")?e.getActionCommand():textField.getText()+e.getActionCommand());break;
				case "=": switch (operation){					
				
				case "ADDITION": textField.setText(""+( Double.parseDouble(tempVal)+Double.parseDouble(textField.getText())));
				break;//Addition operation done when equal sign button clicked
				case "SUBTRACTION": textField.setText(""+( Double.parseDouble(tempVal)-Double.parseDouble(textField.getText()))); 
				break; //subtraction operation done when equal sign button clicked
				case "MULTIPLICATION": textField.setText(""+(Double.parseDouble(tempVal)*Double.parseDouble(textField.getText()))); 
				break; //multiplication operation done  when equal sign button clicked
				case "DIVISION": textField.setText(""+(Double.parseDouble(tempVal)/Double.parseDouble(textField.getText()))); 
				break; //division operation done when equal sign button clicked
				}
			}
			}
		};
		
		JButton button = new JButton("1");
		button.addActionListener(myActn);
		button.setBounds(10, 73, 48, 30);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(myActn);
		button_1.setBounds(68, 73, 48, 30);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(myActn);
		button_2.setBounds(126, 73, 48, 30);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("+");
		button_3.addActionListener(myActn);
		button_3.setBounds(246, 73, 48, 30);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(myActn);
		button_4.setBounds(10, 118, 48, 30);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(myActn);
		button_5.setBounds(68, 118, 48, 30);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(myActn);
		button_6.setBounds(126, 118, 48, 30);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("-");
		button_7.addActionListener(myActn);
		button_7.setBounds(246, 118, 48, 30);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("7");
		button_8.addActionListener(myActn);
		button_8.setBounds(10, 169, 48, 30);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("8");
		button_9.addActionListener(myActn);
		button_9.setBounds(68, 169, 48, 30);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("9");
		button_10.addActionListener(myActn);
		button_10.setBounds(126, 169, 48, 30);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(myActn);
		button_11.setBounds(246, 169, 48, 30);
		contentPane.add(button_11);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(myActn);
		btnC.setBounds(10, 223, 48, 30);
		contentPane.add(btnC);
		
		JButton button_13 = new JButton("0");
		button_13.addActionListener(myActn);
		button_13.setBounds(68, 223, 48, 30);
		contentPane.add(button_13);
		
		JButton button_15 = new JButton("/");
		button_15.addActionListener(myActn);
		button_15.setBounds(246, 223, 48, 30);
		contentPane.add(button_15);
		
		JButton button_12 = new JButton("=");
		button_12.addActionListener(myActn);
		button_12.setBounds(126, 223, 52, 30);
		contentPane.add(button_12);
	}
}

