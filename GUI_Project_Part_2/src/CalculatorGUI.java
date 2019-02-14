import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 29, 350, 48);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(10, 107, 80, 60);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("4");
		button.setBounds(10, 178, 80, 60);
		contentPane.add(button);
		
		JButton button_1 = new JButton("7");
		button_1.setBounds(10, 263, 80, 60);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setBounds(100, 107, 80, 60);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setBounds(100, 178, 80, 60);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.setBounds(100, 263, 80, 60);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("3");
		button_5.setBounds(190, 107, 80, 60);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setBounds(190, 178, 80, 60);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.setBounds(190, 263, 80, 60);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("*");
		button_8.setBounds(280, 107, 80, 60);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("/");
		button_9.setBounds(280, 178, 80, 60);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.setBounds(280, 263, 80, 60);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("0");
		button_11.setBounds(100, 345, 80, 60);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("+");
		button_12.setBounds(280, 345, 80, 60);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.setBounds(190, 345, 80, 60);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton(".");
		button_14.setBounds(10, 345, 80, 60);
		contentPane.add(button_14);
	}
}
