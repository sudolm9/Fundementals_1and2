import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class testtest extends JPanel
{
   private final int WIDTH = 300, HEIGHT = 200;
   private final int JUMP = 50;  // increment for image movement

   private final int IMAGE_SIZE = 31;

   private ImageIcon up, down, right, left, currentImage;
   private int x, y;
 //-----------------------------------------------------------------
   //  Constructor: Sets up this panel and loads the images.
   //-----------------------------------------------------------------
   public void testtestPanel()
   {
	   

      
      setFocusable(true);
      setPreferredSize(new Dimension(600, 430));
   }
   public testtest()
   {
      addKeyListener(new DirectionListener());

      x = WIDTH / 2;
      y = HEIGHT / 2;

      up = new ImageIcon("robot.png");
      down = new ImageIcon("robot.png");
      left = new ImageIcon("robot.png");
      right = new ImageIcon("robot.png");

      currentImage = right;
   }
 //-----------------------------------------------------------------
   //  Draws the image in the current location.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics page)
   {
		   super.paintComponent(page);
		   File input = new File("maze.png");
		   Image  img = new ImageIcon("maze.png").getImage();
      super.paintComponent(page);
      currentImage.paintIcon(this, page, x, y);
   }

   //*****************************************************************
   //  Represents the listener for keyboard activity.
   //*****************************************************************
   private class DirectionListener implements KeyListener
   {
      //--------------------------------------------------------------
      //  Responds to the user pressing arrow keys by adjusting the
      //  image and image location accordingly.
      //--------------------------------------------------------------
      public void keyPressed(KeyEvent event)
      {
         switch (event.getKeyCode())
         {
            case KeyEvent.VK_UP:
               currentImage = up;
               y -= JUMP;
               break;
            case KeyEvent.VK_DOWN:
                currentImage = down;
                y += JUMP;
                break;
             case KeyEvent.VK_LEFT:
                currentImage = left;
                x -= JUMP;
                break;
             case KeyEvent.VK_RIGHT:
                currentImage = right;
                x += JUMP;
                break;
          }

          repaint();
       }

       //--------------------------------------------------------------
       //  Provide empty definitions for unused event methods.
       //--------------------------------------------------------------
       public void keyTyped(KeyEvent event) {}
       public void keyReleased(KeyEvent event) {}
    }
 }

