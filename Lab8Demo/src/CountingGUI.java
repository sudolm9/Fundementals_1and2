import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class CountingGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CountingGUI frame = new CountingGUI();
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
	public CountingGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 11, 393, 133);
		contentPane.add(textPane);
		
		JButton btnCount = new JButton("Count");
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Demo_2 cntr = new Demo_2();
				JOptionPane.showMessageDialog(null,
				cntr.textStats(textPane.getText())
				);
			}
		});
		btnCount.setBounds(85, 185, 89, 23);
		contentPane.add(btnCount);
		

	}
}
