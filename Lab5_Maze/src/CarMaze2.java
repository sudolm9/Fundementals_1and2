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
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class CarMaze2 extends JPanel {
	int x = 20, y = 270;
	int ani = 0;
	int controls = 0;

	JButton bani = new JButton("Animate Solving");
	JButton bcon = new JButton("Play");

	// -----------------------------------------------------------------
	// Constructor
	// -----------------------------------------------------------------
	public CarMaze2() {
		addKeyListener(new DotsListener());
		setFocusable(true);
		setPreferredSize(new Dimension(850, 600));

		// setLayout(new BorderLayout());
	}

	// -----------------
	// paintCOMPONENT
	// -----------------

	public void paintComponent(Graphics page) {

		// setLayout(new BorderLayout());
		// setLayout(new FlowLayout());
		super.paintComponent(page);
		File input = new File("maze2.png");
		Image img = new ImageIcon("maze2.png").getImage();

		BufferedImage bufferedImage;
		try {
			bufferedImage = ImageIO.read(input);
			Color up = new Color(bufferedImage.getRGB(x, y + 10));
			Color right = new Color(bufferedImage.getRGB(x + 10, y));
			Color left = new Color(bufferedImage.getRGB(x - 10, y));
			Color down = new Color(bufferedImage.getRGB(x, y - 10));
			// System.out.println("Red:"+up.getRed()+",\t
			// Green:"+up.getGreen()+",\t Blue:"+up.getBlue());
			if (up.getRed() < 255)
				y -= 10;
			else if (down.getRed() < 255)
				y += 10;
			else if (left.getRed() < 255)
				x += 10;
			else if (right.getRed() < 255)
				x -= 10;
		} catch (IOException e) {
			e.printStackTrace();
		}

		page.drawImage(img, 0, 0, null);

		// --------
		// CAR
		// --------
		int xpoints[] = { x, x + 10, x + 5, x };
		int ypoints[] = { y - 6, y - 6, y - 19, y - 19 };

		// top
		page.setColor(new Color(50, 200, 230));
		page.fillPolygon(xpoints, ypoints, 4);
		page.setColor(new Color(0, 0, 0));
		page.drawPolygon(xpoints, ypoints, 4);

		// body
		page.setColor(new Color(230, 90, 90));
		page.fillRect(x - 14, y - 6, 25, 15);
		page.setColor(new Color(0, 0, 0));
		page.drawRect(x - 14, y - 6, 25, 15);

		// tire
		page.setColor(new Color(0, 0, 0));
		page.fillOval(x - 17, y + 4, 10, 10);
		page.setColor(new Color(0, 0, 0));
		page.drawOval(x - 17, y + 4, 10, 10);

		// tire
		page.setColor(new Color(0, 0, 0));
		page.fillOval(x + 3, y + 4, 10, 10);
		page.setColor(new Color(0, 0, 0));
		page.drawOval(x + 3, y + 4, 10, 10);

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

			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				controls = 0;
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				controls = 1;
			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				controls = 2;
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				controls = 3;
			}

			if (controls == 0) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					x += 10;
				}
			}

			if (controls == 1) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					y += 10;
				}
			}

			if (controls == 2) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					y -= 10;
				}
			}

			if (controls == 3) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					x -= 10;
				}
			}

			repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
		}

	}
}
