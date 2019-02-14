import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


import java.awt.event.KeyEvent;

public class MazePanel extends JPanel
{
int x=20, y=270;

   ImageIcon icon=new ImageIcon("robot.jpg");

   //-----------------------------------------------------------------
   //  Constructor: Sets up this panel to listen for mouse events.
   //-----------------------------------------------------------------
   public MazePanel()
   {
      addKeyListener (new DotsListener());
      setFocusable(true);
      setPreferredSize(new Dimension(600,430));
   }

public void paintComponent(Graphics page)
   {
	
	   super.paintComponent(page);
	   File input = new File("maze.png");
	   Image  img = new ImageIcon("maze.png").getImage();
	   Image  img2 = new ImageIcon("robot.png").getImage();
	    BufferedImage bufferedImage;
		try {
			bufferedImage = ImageIO.read(input);
		    Color up=new Color(bufferedImage.getRGB(x, y+10)); 
		    Color right=new Color(bufferedImage.getRGB(x+10, y));
		    Color left=new Color(bufferedImage.getRGB(x-10, y));
		    Color down=new Color(bufferedImage.getRGB(x, y-10));
			// System.out.println("Red:"+c.getRed()+",\t Green:"+c.getGreen()+",\t Blue:"+c.getBlue());
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
	    page.drawImage(img2, x-14, y-10, null);
	   System.out.println();
 
   }



 public class DotsListener implements KeyListener
   {

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	
		
				if(e.getKeyCode()==KeyEvent.VK_RIGHT)
					x+=10;
				else if(e.getKeyCode()==KeyEvent.VK_DOWN)
					y+=10; 
				else if(e.getKeyCode()==KeyEvent.VK_UP)
					y-=10;
				else if(e.getKeyCode()==KeyEvent.VK_LEFT)
					x-=10;
		   repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
   }
}
