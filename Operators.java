package com.qa.qacommunity;
import java.util.Scanner; 

public class Operators {
	
	public static void main(String[] args) {
		
		myMethod();
		
	}

	
	static void myMethod() {
	
	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter first number: ");
	double num1 = myObj.nextDouble();
	
	System.out.println("Enter operand: ");
	String op = myObj.next(); 
	
	System.out.println("Enter second number: ");
	double num2 = myObj.nextDouble();
	
	if (op.equals("+")) {
		
		System.out.println(num1 + num2);
	}
	
	else if (op.equals("-")) {
	
		System.out.println(num1 - num2);
	}
	
	else if (op.equals("/")) {
		System.out.println(num1 % num2);
	}
	
	else if (op.equals("*")) {
		System.out.println(num1 * num2);
	}
	
	else {
		System.out.println("Oops something went wrong");
	
	  }
	
	}
	
}
