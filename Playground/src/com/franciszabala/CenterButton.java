package com.franciszabala;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CenterButton extends JFrame{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public CenterButton(){
      setLayout(new BorderLayout());

      JPanel panel = new JPanel();
      JButton button = new JButton("A-ha!");
      button.setAlignmentX(
      Component.CENTER_ALIGNMENT);
      panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
      panel.add(Box.createVerticalGlue());
      panel.add(button);
      panel.add(Box.createVerticalGlue());

      getContentPane().add(panel);

      setVisible(true);
   }

   public static void main(String[] args) {
      new CenterButton();
   }

}