
import javax.swing.JFrame;

public class MazeMain
{
//-----------------------------------------------------------------
//  Creates and displays the application frame.
//-----------------------------------------------------------------

public static void main(String[] args)
{
  JFrame frame = new JFrame("Robot Maze Movement");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  frame.getContentPane().add(new MazePanel());

  frame.pack();
  frame.setVisible(true);
}
}
