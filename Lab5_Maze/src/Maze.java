import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout;

public class Maze {
	// -----------------------------------------------------------------
	// Creates and displays the application frame.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		JFrame frame = new JFrame("Mazes");

		JTabbedPane tp = new JTabbedPane();
		tp.addTab("Robot Maze", new Robot());
		tp.addTab("Car Maze 1", new CarMaze1());
		tp.addTab("Car Maze 2", new CarMaze2());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// frame.getContentPane().add(new DotsPanel());
		frame.getContentPane().add(tp);

		frame.pack();
		frame.setVisible(true);

		// -------------------------------
		// CAR IMAGE
		// -------------------------------

	}
}
