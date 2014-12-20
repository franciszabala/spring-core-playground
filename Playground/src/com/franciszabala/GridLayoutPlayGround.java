package com.franciszabala;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class GridLayoutPlayGround extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int ROWS = 7;
	private static int COL = 10;
	
	public void generator() {
		//ImageIcon wIcon = new ImageIcon;
		ImageIcon wIcon = new ImageIcon();
		//Grid grid = new Grid();
		JPanel jPan1 = new JPanel();
		//jPan1.setLayout((LayoutManager) new GridLayout(rows,col,1,1));
		jPan1.setLayout((LayoutManager) new GridLayout(ROWS,COL,1,1));
		jPan1.setSize(350,305);
		
		TitledBorder bdr = javax.swing.BorderFactory.createTitledBorder(null, "Targeting Grid");
		bdr.setTitleColor(java.awt.Color.RED);
		jPan1.setLayout((LayoutManager) new GridLayout(ROWS,COL,1,1));
		
		jPan1.setBorder(bdr);
		
		JButton b[] = new JButton[ROWS*COL];
		
		for (int i = 0, j=ROWS*COL; i < j; i++) {
			b[i] = new JButton(wIcon);
			b[i].setSize(20,20);
			b[i].setMaximumSize(new Dimension(20,20));
			b[i].setPreferredSize(new Dimension(20,20));
			System.out.println("loop test " +i);
			jPan1.add(b[i]);
		}
	
		JFrame test = new JFrame();
		test.getContentPane().add(jPan1);
		test.setVisible(true);
	}
	
	  public static void main(String[] args) {
	      new GridLayoutPlayGround().generator();
	   }
	
	  
}
