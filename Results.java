package com.qa.qacommunity;

import java.util.Scanner;

public class Results {
	public static void main(String[] args) {
		myResults();

	}

	static void myResults() {

		Scanner myObj = new Scanner(System.in);

		int totalScore = 60;
		float percentageP;
		float percentageC;
		float percentageB;
		float overalPercentage;

		System.out.println("Enter Physics grade here out of 60: ");
		double physicsGrade = myObj.nextDouble();

		System.out.println("Enter Chemistry grade here out of 60: ");
		double chemistryGrade = myObj.nextDouble();

		System.out.println("Enter Biology grade here out of 60: ");
		double biologyGrade = myObj.nextDouble();

		percentageP = (float) ((physicsGrade * 100) / totalScore);
		System.out.println("Percentage is: " + percentageP + "%");

		percentageC = (float) ((chemistryGrade * 100) / totalScore);
		System.out.println("Percentage is: " + percentageC + "%");

		percentageB = (float) ((biologyGrade * 100) / totalScore);
		System.out.println("Percentage is: " + percentageB + "%");

		overalPercentage = (float) (percentageP + percentageC + percentageB) / 3;
		System.out.println("Overal percentage is: " + overalPercentage + "%");

		if (percentageP < 60) {
			System.out.println("Failed");
		}

		else if (percentageC < 60) {
			System.out.println("Failed");

		}

		else if (percentageB < 60) {
			System.out.println("Failed");

		}

		else if (overalPercentage < 60) {
			System.out.println("Failed");

		}

		else {
			System.out.println("Passed");

		}

	}

}
