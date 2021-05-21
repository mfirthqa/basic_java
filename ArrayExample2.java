package com.qa.qacommunity;

import java.util.Random;

public class ArrayExample2 {
	public static void main(String[] args) {
		AddingValuesToArray();
		
	}
		
		static void AddingValuesToArray(){
		Random randomiseArray = new Random();	
		int[] emptyArray = new int[10];	
		
		emptyArray[0] = randomiseArray.nextInt(200);
		emptyArray[1] = randomiseArray.nextInt(200);
		emptyArray[2] = randomiseArray.nextInt(200);
		emptyArray[3] = randomiseArray.nextInt(200);
		emptyArray[4] = randomiseArray.nextInt(200);
		emptyArray[5] = randomiseArray.nextInt(200);
		emptyArray[6] = randomiseArray.nextInt(200);
		emptyArray[7] = randomiseArray.nextInt(200);
		emptyArray[8] = randomiseArray.nextInt(200);
		emptyArray[9] = randomiseArray.nextInt(200);
		
			for (int loopArray: emptyArray) {
			
			System.out.println("Array populated: " + loopArray);
				for (int i = 0; i < emptyArray.length; i++) {
					if(emptyArray[i] == loopArray) {
						System.out.println("Value times 10: " + loopArray * 10);
					}
				}
		}
		
			
		
			
			
			
		}
		
		
		
	

}
