import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Robot extends JPanel {
	int x = 20, y = 270;
	int ani = 0;
	int controls = 0;

	ImageIcon icon = new ImageIcon("robot.jpg");
	JButton bani = new JButton("Animate Solving");
	JButton bcon = new JButton("Play");

	// -----------------------------------------------------------------
	// Constructor
	// -----------------------------------------------------------------
	public Robot() {
		addKeyListener(new DotsListener());
		setFocusable(true);
		bcon.setFocusable(false);
		bani.setFocusable(false);
		setPreferredSize(new Dimension(850, 600));

		setLayout(new BorderLayout());

		add(bani, BorderLayout.SOUTH);
		bani.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent animate) {
				x = 20;
				y = 270;
				ani = 1;
				controls = 1;
			}
		});

		add(bcon, BorderLayout.EAST);
		bcon.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent control) {
				x = 20;
				y = 270;
				ani = 0;
				controls = 0;
				repaint();
			}
		});

	}

	// -----------------
	// paintCOMPONENT
	// -----------------

	public void paintComponent(Graphics page) {
		// setLayout(new BorderLayout());
		// setLayout(new FlowLayout());
		super.paintComponent(page);
		File input = new File("maze.png");
		Image img = new ImageIcon("maze.png").getImage();
		Image img2 = new ImageIcon("robot.png").getImage();

		BufferedImage bufferedImage;
		try {
			bufferedImage = ImageIO.read(input);
			Color up = new Color(bufferedImage.getRGB(x, y + 10));
			Color right = new Color(bufferedImage.getRGB(x + 10, y));
			Color left = new Color(bufferedImage.getRGB(x - 10, y));
			Color down = new Color(bufferedImage.getRGB(x, y - 10));
			if (up.getBlue() < 255)
				y -= 10;
			else if (down.getBlue() < 255)
				y += 10;
			else if (left.getBlue() < 255)
				x += 10;
			else if (right.getBlue() < 255)
				x -= 10;
		} catch (IOException e) {
			e.printStackTrace();
		}

		page.drawImage(img, 0, 0, null);
		page.drawImage(img2, x - 14, y - 10, null);

		if (ani >= 1) {
			Animation();
		}
	}


	// -----------------
	// ANIMATION
	// -----------------
	public void Animation() {
		if (x < 55) {
			try {
				Thread.sleep(1);
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			x++;
		}

		if (x == 55 && y > 160) {
			try {
				Thread.sleep(1);
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			y--;
		}

		if (x < 274 && y == 160) {
			try {
				Thread.sleep(1);
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			x++;
		}
		if (x == 274 && y > 100) {
			try {
				Thread.sleep(1);
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			y--;
		}
		if (x < 335 && y == 100) {
			try {
				Thread.sleep(1);
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			x++;
		}
		if (x == 335 && y < 328) {
			try {
				Thread.sleep(1);
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			y++;
		}
		if (x < 390 && y == 328) {
			try {
				Thread.sleep(1);
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			x++;
		}
		if (x == 390 && y > 215) {
			try {
				Thread.sleep(1);
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			y--;
		}
		if (x < 510 && y == 215) {
			try {
				Thread.sleep(1);
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			x++;
		}
		if (x == 510 && y > 105) {
			try {
				Thread.sleep(1);
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			y--;
		}
		if (x < 565 && y == 105) {
			try {
				Thread.sleep(1);
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			x++;
		}
		if (x == 565 && y < 253) {
			try {
				Thread.sleep(1);
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			y++;
		}
		if (x < 575 && y == 253) {
			try {
				Thread.sleep(1);
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			x++;
		}
	}

	// ------------
	// ARROW CONTROLS -- KEYLISTENER
	// ------------
	public class DotsListener implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {

		}

		@Override
		public void keyPressed(KeyEvent e) {

			if (controls == 0) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT)
					x += 10;
				else if (e.getKeyCode() == KeyEvent.VK_DOWN)
					y += 10;
				else if (e.getKeyCode() == KeyEvent.VK_UP)
					y -= 10;
				else if (e.getKeyCode() == KeyEvent.VK_LEFT)
					x -= 10;
				// CONTROLS FOR CODER, KEEP COMMENTED
				// else if(e.getKeyCode()==KeyEvent.VK_SPACE){
				// System.out.println("x= " + x);
				// System.out.println("y= " + y);}
				// else if(e.getKeyCode()==KeyEvent.VK_SHIFT){
				// x=20;
				// y=270;
				// ani++;}
				repaint();
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {

		}
	}
}
