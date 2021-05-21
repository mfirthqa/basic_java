package com.qa.qacommunity;
import java.util.Scanner;

public class UniqueSum {
	
	public static void main(String[] args) {
		uniqueSum();
		}
	
	static void uniqueSum() {
		Scanner scanNum = new Scanner(System.in);
		
		System.out.println("Enter a integer: ");
		int num1 = scanNum.nextInt();
		
		System.out.println("Enter another integer: ");
		int num2 = scanNum.nextInt();
		
		System.out.println("Enter another integer: ");
		int num3 = scanNum.nextInt();
		
		if (num1 == num2 && num2 == num3 && num1 == num3) {
			System.out.println(num1);
		}
		
		else if (num1 == num2) {
			System.out.println(num1 + num3);
		}
		
		else if (num1 == num3) {
			System.out.println(num1 + num2);
			
		}
		
		else if (num2 == num3) {
			System.out.println(num1 + num2);
			
		}
		
		else {
			System.out.println(num1 + num2 + num3);
		}
		
		
	}

}
