import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Game {

	static JButton tmpBtn = new JButton();
	public static void main(String[] a){
		
		JButton[] btnLst = new JButton[9];
		ActionListener lnst = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				tmpBtn=(JButton)e.getSource();
				if(tmpBtn.getText().equals(" ")){
					tmpBtn.setText("X");		
			}
		}};
				
		JFrame frame = new JFrame("My calc demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(300,450);
		frame.setVisible(true);
		
		for (int i =0; i<btnLst.length; i++){
			btnLst[i] = new JButton(" ");
			btnLst[i].addActionListener(lnst);
			btnLst[i].setBounds(25+(75*(i % 3)), 100 +75*(i/3), 75, 75 ) ;
			frame.getContentPane().add(btnLst[i]);
		}
		
	}
}
