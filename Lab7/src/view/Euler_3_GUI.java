package view;

//import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.SwingUtilities;

import controller.EulerProblem3;

	public class Euler_3_GUI extends JFrame {

		
		JTextField field=new JTextField(20);
		JLabel jlabel=new JLabel("Enter number you wish to find the prime factor of...");
		JButton button=new JButton("Find Prime Factor");

		
		
		public Euler_3_GUI() {
		setLayout(new FlowLayout());
		add(field);
		add(button);
		add(jlabel);
		EulerProblem3 euler = new EulerProblem3();

		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String input = field.getText();
				if (input.contains(".")){
					JOptionPane.showMessageDialog(Euler_3_GUI.this, "Please use whole numbers only");}
				else{
				input = input.replaceAll( "[^0-9]", "" );
				long inputnum = Long.parseLong(input);
				JOptionPane.showMessageDialog(Euler_3_GUI.this, euler.PrimeFactor(inputnum));}
			}
	});

		
		setSize(340,130);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
		
		public static void main(String[] args) {
		//	SwingUtilities.invokeLater(new Runnable() {
		//		public void run() {
					new Euler_3_GUI();
			//	}
		//	});

		}
	}

