package com.franciszabala;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BooleanTest extends JPanel{
	static boolean bufferedImageEquals (BufferedImage b1, BufferedImage b2) {
		
		if (b1 == b2) { return true; }
		
		if (b1 == null || b2 == null ) { return false;}
		
		if (b1.getWidth() != b2.getWidth()) { return false;}
		
		if (b1.getHeight() != b2.getHeight()) { return false; }
		
		for ( int i = 0; i < b1.getWidth(); i++) {
			for ( int j = 0; j < b1.getHeight(); j++) {
				if (b1.getRGB(i, j) != b2.getRGB(i, j)) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	 public void paint(Graphics g) {
	      Image img = createImageWithText();
	      g.drawImage(img, 20,20,this);
	   }

	   private Image createImageWithText(){
	      BufferedImage bufferedImage = new 
	      BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
	      Graphics g = bufferedImage.getGraphics();

	      g.drawString("www.tutorialspoint.com", 20,20);
	      g.drawString("www.tutorialspoint.com", 20,40);
	      g.drawString("www.tutorialspoint.com", 20,60);
	      g.drawString("www.tutorialspoint.com", 20,80);
	      g.drawString("www.tutorialspoint.com", 20,100);
	      return bufferedImage;
	   }
	   public static void main(String[] args) {
	      JFrame frame = new JFrame();
	      frame.getContentPane().add(new BooleanTest());

	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setSize(200, 200);
	      frame.setVisible(true);
	      
	      
	      BufferedImage bufferedImage = new 
	      BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
	      Graphics g = bufferedImage.getGraphics();

	      g.drawString("www.tutorialspoint.com", 20,20);
	      g.drawString("www.tutorialspoint.com", 20,40);
	      g.drawString("www.tutorialspoint.com", 20,60);
	      g.drawString("www.tutorialspoint.com", 20,80);
	      g.drawString("www.tutorialspoint.com", 20,100);
	      
	      BufferedImage bufferedImage2 = new 
	      BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
	      Graphics g2 = bufferedImage.getGraphics();

	      g2.drawString("www.tutorialspoint.com", 20,20);
	      g2.drawString("www.tutorialspoint.com", 20,40);
	      g2.drawString("www.tutorialspoint.com", 20,60);
	      g2.drawString("www.tutorialspoint.com", 20,80);
	      g2.drawString("www.tutorialspoint.com", 20,100);
	      
	      bufferedImageEquals(bufferedImage, bufferedImage2);
	   }
}
