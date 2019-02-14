import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class ProjectGUI extends JFrame {
	
	private HTMLEditorKit kit;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	
	private String letter_heading1 = "<h3> Excuse letter for my child missing school</h3>";
	private String Introduction = " Dear ";
	private String first_sentence = "My child,";
	private String sentencep_2 = " missed school the past couple days because he was ";
	private String second_sentence = " He will ";
	private String ssentencep_2 = " the letter to school on ";
	private String Sincerely = "<p align=right>" + "Sincerely,";
	private String sentence_3 = " Thank you and sorry for this incovience,have a nice day.";
	private JTextField textField_5;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectGUI frame = new ProjectGUI();
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
	public ProjectGUI() {
		setTitle("Letter for sick child");
		kit = new HTMLEditorKit();
		
		setBounds(100, 100, 566, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(209, 44, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(209, 75, 128, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(209, 106, 128, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(209, 137, 128, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(209, 168, 128, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(208, 11, 129, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblRandomName = new JLabel("Random name(ex. Joe)");
		lblRandomName.setBounds(23, 47, 176, 14);
		contentPane.add(lblRandomName);
		
		lblNewLabel = new JLabel("adjective (ex. sick)");
		lblNewLabel.setBounds(23, 78, 176, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("action verb (ex. bring)");
		lblNewLabel_1.setBounds(23, 109, 176, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("day of the week");
		lblNewLabel_2.setBounds(23, 140, 176, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Random parent name");
		lblNewLabel_3.setBounds(23, 171, 176, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblTeachersName = new JLabel("Teacher's name with comma");
		lblTeachersName.setBounds(23, 22, 175, 14);
		contentPane.add(lblTeachersName);
		
		JLabel lblFollowedByA = new JLabel("second and fourth textFields need to be followed by a period");
		lblFollowedByA.setBounds(24, 199, 294, 14);
		contentPane.add(lblFollowedByA);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 224, 530, 214);
		contentPane.add(editorPane);
		editorPane.setVisible(false); // editorPane not visible
		editorPane.setEditable(false); // editorPane not editable by the user
		
		JButton btnShowLetter = new JButton("Show Letter");
		btnShowLetter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editorPane.setVisible(true); // once clicked editorPane will be visible
			}
		});
		btnShowLetter.setBounds(373, 87, 120, 23);
		contentPane.add(btnShowLetter);	
		
		JButton btnCreate = new JButton("Create"); // creates the whole letter from the user inputs and html defined text
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				editorPane.setEditorKit(kit);
				editorPane.setText(
						
				letter_heading1+
				
				Introduction+
				textField_5.getText()+
				"\n"+"\n <hr/>"+
				first_sentence + 
				textField.getText()+
				sentencep_2+
				textField_1.getText()+
				second_sentence +
				textField_2.getText()+
				ssentencep_2+
				textField_3.getText()+
				sentence_3+
				Sincerely+
				"<p align=right>"+textField_4.getText()+"</p>");
				
			}
		});
		btnCreate.setBounds(373, 10, 120, 23);
		contentPane.add(btnCreate);
		
		JButton btnClose = new JButton("Close"); // button to close the frame
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(373, 167, 120, 23);
		contentPane.add(btnClose);
		
		
		
		
	}
}



			

