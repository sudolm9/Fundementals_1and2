import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;

public class WeightGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtFt;
	private JTextField txtIn;
	private JTextField txtWeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeightGUI frame = new WeightGUI();
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
	public WeightGUI() {
		setTitle("Ideal Weight GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblHeight = new JLabel("Height");
		lblHeight.setForeground(Color.WHITE);
		lblHeight.setBackground(Color.WHITE);
		lblHeight.setVerticalAlignment(SwingConstants.BOTTOM);
		lblHeight.setFont(new Font("Arial", Font.PLAIN, 12));
		lblHeight.setBounds(10, 35, 46, 14);
		contentPane.add(lblHeight);

		txtFt = new JTextField();
		txtFt.setBounds(10, 60, 86, 20);
		contentPane.add(txtFt);
		txtFt.setColumns(10);

		JLabel lblFt = new JLabel("ft.");
		lblFt.setForeground(Color.WHITE);
		lblFt.setBounds(102, 63, 46, 14);
		contentPane.add(lblFt);

		txtIn = new JTextField();
		txtIn.setColumns(10);
		txtIn.setBounds(118, 60, 86, 20);
		contentPane.add(txtIn);

		JLabel lblIn = new JLabel("in.");
		lblIn.setForeground(Color.WHITE);
		lblIn.setBounds(212, 63, 46, 14);
		contentPane.add(lblIn);

		JTextPane txtpnIdealWeight = new JTextPane();
		txtpnIdealWeight.setBackground(UIManager.getColor("Button.background"));
		txtpnIdealWeight.setText("Ideal Weight:");
		txtpnIdealWeight.setBounds(206, 98, 218, 55);
		contentPane.add(txtpnIdealWeight);
		
		JTextPane txtpnRange = new JTextPane();
		txtpnRange.setText("Weight Range:");
		txtpnRange.setBackground(SystemColor.menu);
		txtpnRange.setBounds(206, 175, 213, 78);
		contentPane.add(txtpnRange);

		JButton btnFemaleIdeal = new JButton("Female Ideal Weight");
		btnFemaleIdeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Declare our variables
				int Ffeet = 0, Finches, fweight;
				String Frange;
				String fresults;
				
				if (txtFt.getText().equals("")) {
					txtFt.requestFocus();
					return;
				}
				// Make sure we can convert txtFeet input (string) into an integer
				if (isNumber(txtFt.getText())) {
					Ffeet = Integer.parseInt(txtFt.getText()); // if it's a number, set feet
				}
				// Validate inches field
				if (txtIn.getText().equals("")) {
					Finches = 0;
					txtIn.setText("0");
				} else if (isNumber(txtIn.getText())) {
					Finches = Integer.parseInt(txtIn.getText());
				} else {
					txtIn.setText("");
					txtIn.grabFocus();
					return;
				}

				fweight = 100 + 5 * ((Ffeet * 12 + Finches) - 60);//calculates the weight
				fresults = String.format("Females with a height of %d feet %d inches, the ideal weight will be %d lbs.\",", Ffeet,
						Finches, fweight);// displays the feet,inches and weight in a formatted way
				txtpnIdealWeight.setText(fresults); // Show results in the label
				Frange = ("Female weight range is :") + fweight * .85 + ("-") + (fweight * 1.15);//calculates the weight range
				txtpnRange.setText(Frange);//displays the weight range in the textpane
	
			}
		});

		btnFemaleIdeal.setBounds(10, 109, 168, 23);
		contentPane.add(btnFemaleIdeal);

		JButton btnMaleIdeal = new JButton("Male Ideal Weight");
		btnMaleIdeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Declare our variables
				int Mfeet, Minches, mweight;
				String Mrange;
				String mresults;
				
				if (txtFt.getText().equals("")) {
					txtFt.requestFocus();
					return;
				}
				// Make sure we can convert txtFeet input (string) into an integer
				if (isNumber(txtFt.getText())) {
					Mfeet = Integer.parseInt(txtFt.getText()); // if it's a number,set feet
				} else {
					txtFt.setText("");
					txtFt.requestFocus();
					return;
				}
				// Validate inches field
				if (txtIn.getText().equals("")) {
					Minches = 0;
					txtIn.setText("0");
				} else if (isNumber(txtIn.getText())) {
					Minches = Integer.parseInt(txtIn.getText());
				} else {
					txtIn.setText("");
					txtIn.grabFocus();
					return;
				}
				mweight = 106 + 6 * ((Mfeet * 12 + Minches) - 60);//calculates the weight
				mresults = String.format("Males with a height of %d feet %d inches, the ideal weight will be %d lbs.\",", Mfeet,
						Minches, mweight); // displays the feet,inches and weight in a formatted way
				txtpnIdealWeight.setText(mresults); // Show results in the label
				Mrange = ("Male weight range is :") +mweight * .85 + ("-") + (mweight * 1.15);//calculates the weight range
				txtpnRange.setText(Mrange); //displays the weight range in the textpane
			
			}
		});
		btnMaleIdeal.setBounds(7, 191, 171, 23);
		contentPane.add(btnMaleIdeal);

	}

	private boolean isNumber(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
