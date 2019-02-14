import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problem_6 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problem_6 frame = new Problem_6();
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
	public Problem_6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 181);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(41, 21, 162, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(41, 72, 138, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Reverse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int number = 0, lastDigit = 0, reverse = 0;
				number = Integer.parseInt(textField.getText());
				do
				{
					lastDigit = number % 10;
					reverse = (reverse * 10) + lastDigit;
					number = number  / 10;
				}
				while (number > 0);
				lblNewLabel.setText("Reverse: "+ reverse);
				}
			
		});
		btnNewButton.setBounds(210, 68, 89, 23);
		contentPane.add(btnNewButton);
	}
}
