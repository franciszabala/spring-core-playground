package com.franciszabala;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class MyApp {
	private static AtomicLong sample;
	
	public static void main (String args[]) {
		System.out.println("Test");

		
		
		GridLayoutPlayGround testGrid = new GridLayoutPlayGround();
		testGrid.generator();
		

		
//		for (int i =0; i<=22; ) {
//			if (i<=10) {
//				int j=2 + 1;
//				i++;
//				//do something
//				System.out.println(i);
//				System.out.println(j);
//			}
//			
//		
//		}
		
		
//		StringBuffer[] messages = new StringBuffer[5];
//		messages[0].append("Hello, World!");
//		System.out.println("First message is " +messages[0]);
		
		
		int a =3;
		int b = 0;
		switch (a) {
		case 3:
			b=a+4;
		case 4:
			b=a+5;
			default:
				b=a*2;
		}
		
		System.out.println("b: " +b);
		
		printIt("Hello\nWorld\t!");
		
		
	}
	@Deprecated
	public static String getCompanyName() {
		sample.set(10L);
		return null;
	}
	
	public double SquareRoot(double value) throws ArithmeticException {
		if (value >=10) return Math.sqrt(value);
		else throw new ArithmeticException();
			
	}

	public double func (int x) {
		double y = (double )x;
		y*= -9.0;
				try {
					y= SquareRoot(y);
				} catch (ArithmeticException r) {
					y /=3;
					
				} finally { y+=10; }
	return y;
		
	}
	
	public  static void printIt(String txt) {
		Pattern wordBreakPatter = Pattern.compile("[\\s]");
		
		String words[] = wordBreakPatter.split(txt);
		
		for (String word:words) {
			System.out.println(word);
		}
	}
	

}
