import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Main_Application_GUI_Interface extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Application_GUI_Interface frame = new Main_Application_GUI_Interface();
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
	public Main_Application_GUI_Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(52, 58, 209, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(175, 55, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCalc = new JButton("calc");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num=Integer.parseInt(textField.getText());
				
				Problems_Controller calc=new Problems_Controller();
				lblNewLabel.setText("Diif is:  "+(calc.squareOfSum(num) -calc.sumOfSquares(num))
						);
			}
		});
		btnCalc.setBounds(51, 106, 89, 23);
		contentPane.add(btnCalc);
		
		
	}

}
