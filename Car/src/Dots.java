import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout;

public class Dots
{
//-----------------------------------------------------------------
//Creates and displays the application frame.
//-----------------------------------------------------------------
public static void main(String[] args)
{
JFrame frame = new JFrame("Mazes");

JTabbedPane tp = new JTabbedPane();
tp.addTab("Robot Maze", new Robot());
tp.addTab("Car Maze 1", new CarMaze());



frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//frame.getContentPane().add(new DotsPanel());
frame.getContentPane().add(tp);

frame.pack();
frame.setVisible(true);
}
}
