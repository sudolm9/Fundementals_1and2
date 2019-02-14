import java.awt.*;
import java.awt.Graphics;

import javax.swing.*;
public class MyFirstHouseGUI extends JFrame {

	public static void main(String[] args) {
		MyFirstHouseGUI gui = new MyFirstHouseGUI();
			gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gui.setSize(600,700);
			gui.setVisible(true);
			gui.setTitle("A House");
			gui.getContentPane().setLayout(null);
			
			JPanel pnl = new JPanel(){
				public void paintComponent(Graphics g){
				super.paintComponent(g);getInsets();
				
					g.setColor(new Color(135,206,235)); // sky
					g.fillRect(0, 0, 900, 300);
					
					g.setColor(new Color(165,42,42)); // the square of the house
					g.fillRect(100, 150, 400 ,390);
					
					
					
					//Roof of the house
					g.setColor(new Color(255,255,255));
					g.fillPolygon(new int[] {20 ,310, 560}, new int[] {150, 10, 150}, 3);
					g.setColor(new Color(0,0,0));
					g.drawPolygon(new int[] {20, 310, 560}, new int[] {150, 10, 150}, 3);
					
					// Rectangle below roof
					g.setColor(new Color(255,255,255));
					g.fillRect(100, 150, 400, 25);
					g.setColor(new Color(0,0,0));
					g.drawRect(100, 150, 400, 25);
					
					
					//Stairs
					g.setColor(new Color(190, 190, 190));
					for (int i=3; i<=12; i++)
					g.fillRect(186-(i*12), 437+(i*8), 230+(23*i), 8);
					
					g.setColor(new Color(0,0,0));
					for (int i=3; i<=12; i++)
					g.drawRect(186-(i*12), 437+(i*8), 230+(23*i), 8);
					
					// window on the house
					g.setColor(new Color(245,230,230)); 
					g.fillRect(265,200,65,35);
					g.setColor(new Color(0,0,0)); 
					g.drawRect(265, 200, 65, 35);
					
					
					//left column
					g.setColor( new Color(255,255,255));
					g.fillRect(110, 175, 35, 275);
					g.setColor(new Color(0,0,0));
					g.drawRect(110, 175, 35, 275);
					g.setColor(new Color(255,255,255));
					g.fillRect(103,450,45,10);
					g.setColor(new Color(0,0,0));
					g.drawRect(103,450,45,10);
					g.setColor(new Color(190,190,190));
					g.fillRect(100, 460, 48, 4);
					g.setColor(new Color(0,0,0));
					g.drawRect(100, 460, 48, 4);
					
					//left door with windows
					g.setColor(new Color(255,255,255));
					g.fillRect(150, 315, 55, 145);
					g.setColor(new Color(0,0,0));
					g.drawRect(150,315,55,145);
					g.fillRect(157, 320, 15, 15);
					g.fillRect(157, 345, 15, 20);
					g.fillRect(157, 375, 15, 20);
					g.fillRect(157, 405, 15, 20);
					g.fillRect(157, 435, 15, 20);
					g.fillRect(183, 320, 15, 15);
					g.fillRect(183, 345, 15, 20);
					g.fillRect(183, 375	,15, 20);
					g.fillRect(183, 405, 15, 20);
					g.fillRect(183, 435, 15, 20);
					
					//second left column
					g.setColor(new Color(255,255,255));
					g.fillRect(215, 175, 35, 279);
					g.setColor(new Color(0,0,0));
					g.drawRect(215, 175, 35, 279);
					g.setColor(new Color(255,255,255));
					g.fillRect(210, 450, 45, 10);
					g.setColor(new Color(0,0,0));
					g.drawRect(210, 450, 45, 10);
					
					//Middle Door with windows
					g.setColor(new Color(255,255,255));
					g.fillRect(260, 295, 75, 165);
					g.setColor(new Color(0,0,0));
					g.drawRect(260,295, 75, 165);
					g.fillRect(270, 325, 15, 15);
					g.fillRect(270, 350, 15, 20);
					g.fillRect(270, 380, 15, 20);
					g.fillRect(270, 407, 15, 20);
					g.fillRect(270, 435, 15, 20);
					g.fillRect(310, 325, 15, 15);
					g.fillRect(310, 350, 15, 20);
					g.fillRect(310, 380, 15, 20);
					g.fillRect(310, 407, 15, 20);
					g.fillRect(310, 435, 15, 20);
					
					//second right column
					g.setColor(new Color(255,255,255));
					g.fillRect(345, 175, 35, 279);
					g.setColor(new Color(0,0,0));
					g.drawRect(345, 175, 35, 279);
					g.setColor(new Color(255,255,255));
					g.fillRect(340, 450, 45, 10);
					g.setColor(new Color(0,0,0));
					g.drawRect(340, 450, 45, 10);
					
					//Right Door with windows
					g.setColor(new Color(255,255,255));
					g.fillRect(390, 315, 55, 145);
					g.setColor(new Color(0,0,0));
					g.drawRect(390, 315, 55, 145);
					g.fillRect(397, 320, 15, 15);
					g.fillRect(397, 345, 15, 20);
					g.fillRect(397, 375, 15, 20);
					g.fillRect(397, 405, 15, 20);
					g.fillRect(397, 435, 15, 20);
					g.fillRect(423, 320, 15, 15);
					g.fillRect(423, 345, 15, 20);
					g.fillRect(423, 375, 15, 20);
					g.fillRect(424, 405, 15, 20);
					g.fillRect(423, 435, 15, 20);
					
					//Right column
					g.setColor(new Color(255,255,255));
					g.fillRect(455, 175, 35, 279);
					g.setColor(new Color(0,0,0));
					g.drawRect(455, 175, 35, 279);
					g.setColor(new Color(255,255,255));
					g.fillRect(451, 450, 45, 10);
					g.setColor(new Color(0,0,0));
					g.drawRect(451, 450, 45, 10);
					g.setColor(new Color(190,190,190));
					g.fillRect(451, 460, 48, 4);
					g.setColor(new Color(0,0,0));
					g.drawRect(451, 460, 48, 4);
					
					//Circles on left column
					g.setColor(new Color(255,255,255));
					g.fillOval(100,175,25,25);
					g.setColor(new Color(0,0,0));
					g.drawOval(100,175,25,25);
					g.setColor(new Color(255,255,255));
					g.fillOval(133, 175, 25, 25);
					g.setColor(new Color(0,0,0));
					g.drawOval(133, 175, 25, 25);
					
					//Circles on second left column
					
					g.setColor(new Color(255,255,255));
					g.fillOval(203, 175, 25, 25);
					g.setColor(new Color(0,0,0));
					g.drawOval(203, 175, 25 , 25);
					g.setColor(new Color(255,255,255));
					g.fillOval(236, 175, 25, 25);
					g.setColor(new Color(0,0,0));
					g.drawOval(236, 175, 25, 25);
					
					//Circles on second right column
					g.setColor(new Color(255,255,255));
					g.fillOval(333, 175, 25, 25);
					g.setColor(new Color(0,0,0));
					g.drawOval(333, 175, 25, 25);
					g.setColor(new Color(255,255,255));
					g.fillOval(366, 175, 25, 25);
					g.setColor(new Color(0,0,0));
					g.drawOval(366, 175, 25, 25);
					
					//Circles on right column
					g.setColor(new Color(255,255,255));
					g.fillOval(443, 175, 25, 25);
					g.setColor(new Color(0,0,0));
					g.drawOval(443,175, 25, 25);
					g.setColor(new Color(255,255,255));
					g.fillOval(476, 175, 25, 25);
					g.setColor(new Color(0,0,0));
					g.drawOval(476, 175, 25, 25);
					
					
					
					
					
					
					
					
		

	}
			};
			pnl.setBackground(new Color(50,205,50)); // grass
			pnl.setBounds(0, 0, 900, 900);
			gui.getContentPane().add(pnl);
	}
	
}

