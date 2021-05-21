package com.qa.qacommunity;

public class Array1 {
	public static void main(String[] args) {
		printArray();
	}

	static void printArray() {
		
		int [] valueArray = {2, 8, 17, 56, 1, 199, 83, 67, 56, 3};
		
		for (int loopArray: valueArray) {
			
			System.out.println(loopArray);
		}
	}
}
