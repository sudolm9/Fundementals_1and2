import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HouseGUI extends JFrame {

	public static void main(String[] args) {
		HouseGUI gui = new HouseGUI();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(500,600);
		gui.setTitle("A House");
		gui.setVisible(true);
		gui.getContentPane().setLayout(null);
		
		JPanel pnl = new JPanel(){
			public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawRect(0, 400, 300, 400);
		};
		}
		
		



