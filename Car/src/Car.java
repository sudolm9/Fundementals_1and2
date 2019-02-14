import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Car extends JPanel{
		public void paintComponent(Graphics g){
					super.paintComponent(g); // getInsets();
		

					int width = 20, height = 20;
					
					//BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

					//Graphics2D ig2 = bi.createGraphics();{
							
					
					BufferedImage image = new BufferedImage(20, 20, BufferedImage.TYPE_INT_ARGB);
					Graphics lol = image.createGraphics();{

								// car frame top 
								g.setColor(new Color(0,0,0)); 
								g.fillRect(290,180,45,20);
								g.setColor(new Color(255,255,255)); 
								g.drawRect(290, 180, 45, 20);
								
								// car frame bottom
								g.setColor(new Color(245,230,230)); 
								g.fillRect(265,200,85,25);
								g.setColor(new Color(0,0,0)); 
								g.drawRect(265, 200, 85, 25);

								//tire
								
								g.setColor(new Color(0,0,0));
								g.fillOval(320, 225, 25, 25);
								g.setColor(new Color(0,0,0));
								g.drawOval(320, 225, 25 , 25);
								
								//tire
								g.setColor(new Color(0,0,0));
								g.fillOval(265, 225, 25, 25);
								g.setColor(new Color(0,0,0));
								g.drawOval(265, 225, 25, 25);
								
								//g.create(x-14, y-11, 20, 15);
						//		BufferedImage g = new BufferedImage(50, 30, BufferedImage.TYPE_INT_RGB);
				
					}

								// Draw your chart

								try {
									ImageIO.write(image, "PNG", new File("yo.PNG"));
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
					
							//	Image yo = new ImageIcon("yo.PNG").getImage();

					
		}
}
