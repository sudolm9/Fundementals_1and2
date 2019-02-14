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

public class CarMaze1 extends JPanel {
	int x = 20, y = 270;
	int ani = 0;
	int controls = 0;

	JButton btn = new JButton("Animate Solving");
	JButton btn2 = new JButton("Play");
	JLabel instruct = new JLabel("Space Bar to go, Directionals to steer");

	// -----------------------------------------------------------------
	// Constructor
	// -----------------------------------------------------------------
	public CarMaze1() {
		addKeyListener(new DotsListener());
		setFocusable(true);
		setPreferredSize(new Dimension(850, 600));

		setLayout(new BorderLayout());
		add(instruct, BorderLayout.SOUTH);
	}
}

