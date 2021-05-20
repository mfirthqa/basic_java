package com.qa.qacommunity;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {

		myBlackjack();

	}

	static void myBlackjack() {

		Random random = new Random();

		int card1 = nextCard();
		int card2 = nextCard();
		int myCards[] = { card1, card2, 0, 0, 0, 0 };
		int numberCards = 2;
		int totalOfCards = myCards[0] + myCards[1];
		System.out.println(totalOfCards);

		while (totalOfCards < 21) {
			Scanner myObj = new Scanner(System.in);
			System.out.println("Press s to stick and h to hit: ");
			String stickOrHit = myObj.next();

			if (stickOrHit.equals("s")) {
				System.out.println("You chose to keep what you have!");
				break;
			}

			else if (stickOrHit.equals("h")) {
				System.out.println("Next card on its way");

			}

			else {
				System.out.println("Invalid command have another go");
				continue;
			}

			myCards[numberCards] = nextCard();
			totalOfCards = totalOfCards + myCards[numberCards];
			System.out.println(totalOfCards);
			numberCards++;

		}

		if (totalOfCards == 21) {
			System.out.println("Congragulations you have won!!!");
		} else {
			System.out.println("You've got too many");
		}

	}

	static int nextCard() {
		Random random = new Random();
		return random.nextInt(11) + 1;

	}

}
	
		
	
	
	
	
	

