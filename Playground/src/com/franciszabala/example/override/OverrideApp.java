package com.franciszabala.example.override;

import java.util.LinkedList;
import java.util.List;

public class OverrideApp {
	
	public static void main (String args[]) {
		
	
		
		List<Double> doubles = new LinkedList<>();
		List<Integer> integers = new LinkedList<Integer>();
		
		List<String> doubleValues = OveriddingGenerics.getValues(doubles);	
		List<String> intValues = OveriddingGenerics.getValues(integers);
	}

}
