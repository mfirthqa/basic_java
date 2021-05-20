package com.qa.qacommunity;
import java.util.Scanner; 

public class Boolean {
	public static void main(String[] args) {
		myBoolean();
		
		}
	
	static void myBoolean() {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter a integer: ");
		int num1 = myObj.nextInt();
		System.out.println("Enter another integer: ");
		int num2 = myObj.nextInt();
		
		System.out.println("Enter true or false: ");
		boolean bool = myObj.nextBoolean();
		
		if (bool == true) {
			System.out.println(num1 + num2);
		}
		
		else if (bool == false) {
			System.out.println(num1 * num2);
		}
		
		else {
			System.out.println("Looks like an incorrect entry");
		}
		
		

		
		
	}

}
