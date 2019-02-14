import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimplePaint extends JFrame {
	String drawShape = "RECT";

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimplePaint frame = new SimplePaint();
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
	public SimplePaint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 487);
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Line");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				drawShape="LINE";
			}
		});
		menuBar.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Rect");
		tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawShape="RECT";
			}
		});
		menuBar.add(tglbtnNewToggleButton_1);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		
		myCustomMadeCanvas myCustomPane = new myCustomMadeCanvas();
		myCustomPane.setBounds(0,0,this.getWidth(), this.getHeight());
		
		contentPane.add(myCustomPane);
		setContentPane(contentPane);
		
		
	}
	
	private class myCustomMadeCanvas extends JPanel{
		int startX, startY, endX, endY;
		
		public myCustomMadeCanvas(){
			setBackground(Color.white);
			
			
			addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e){
					startX=e.getX();
					startY=e.getY();
				}
				public void mouseReleased(MouseEvent e){
					endX=e.getX();
					endY=e.getY();
					repaint();
				}
			});
			
		}
		
		public void paintComponent(Graphics page){
			super.paintChildren(page);
			page.setColor(Color.BLUE);
			if(drawShape.equals("RECT"))
					page.fillRect(Math.min(startX, endX),Math.min(startY,endY), Math.abs(endX-startX),Math.abs(endY-startY));
			else
				page.fillLine(startX,startY,endX,endY);
			
		}
	}

}
