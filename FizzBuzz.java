package com.qa.qacommunity;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		fizzBuzzChallenge();
	}
	
	static void fizzBuzzChallenge(){
	Scanner scanNum = new Scanner(System.in);
	System.out.println ("Enter interger: ");
	int fizzBuzzNum = scanNum.nextInt();
		
	if (fizzBuzzNum % 3 == 0) 
	{	if (fizzBuzzNum % 5 == 0)
		System.out.println("FizzBuzz");
	}
	
	if (fizzBuzzNum % 3 == 0) {
		System.out.println("Fizz");
	}
	
	else if (fizzBuzzNum % 5 == 0) {
		System.out.println("Buzz");
	}
	
	else {
		System.out.println("Not divisible by 3 or 5");
	}
		
	}
}
