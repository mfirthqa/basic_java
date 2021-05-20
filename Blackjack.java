package com.qa.qacommunity;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {
	
	public static void main(String[] args) {
		
		myBlackjack();
		
	}
	
	static void myBlackjack() {
		Random random = new Random();
		
		
		
		int [] myCards = {random.nextInt(12), random.nextInt(12)};
		
		System.out.println(myCards[0]);
		System.out.println(myCards[1]);
		System.out.println ("Press s to stick and h to hit");
		
		
		
	}

	
}
