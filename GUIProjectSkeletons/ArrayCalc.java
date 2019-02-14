import javax.swing.*;

public class ArrayCalc {

	public static void main(String[] a){
		
		JButton[] btnLst = new JButton[9];
				
		JFrame frame = new JFrame("My calc demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(300,450);
		frame.setVisible(true);
		
		for (int i =0; i<btnLst.length; i++){
			btnLst[i] = new JButton("" +(i+1) );
			btnLst[i].setBounds(25+(75*(i % 3)), 100 +75*(i/3), 75, 75 ) ;
			frame.getContentPane().add(btnLst[i]);
		}
		
	}
}
