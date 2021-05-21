package com.qa.qacommunity;

import java.util.Scanner;

public class Taxes {
	public static void main(String[] args) {
		workingOutTaxes();
		
	}
	
	static void workingOutTaxes(){
		int taxBracket1 = 14999;
		int taxBracket2 = 19999;
		int taxBracket3 = 29999;
		int taxBracket4 = 44999;
		float percentageTaxes;
		
		Scanner scanIncome = new Scanner(System.in);
		
		System.out.println("Enter income: ");
		float income = scanIncome.nextFloat();
		
		if (income < taxBracket1){
			System.out.println("0% tax");
			percentageTaxes = (float) (income*(0.0f/100.0f));
			System.out.println("Amount of tax: " + "£" + percentageTaxes + " in taxes");
			
		}
		
		else if (taxBracket2 >= income && taxBracket2 < income){
			System.out.println("10% tax");
			percentageTaxes = (float) (income*(10.0f/100.0f));
			System.out.println("Amount of tax: " + "£" + percentageTaxes + " in taxes");
		}
		
		else if (taxBracket3 >= income && taxBracket2 < income){
			
			System.out.println("15% tax");
			percentageTaxes = (float) (income*(15.0f/100.0f));
			System.out.println("Amount of tax: " + "£" + percentageTaxes + " in taxes");
			}
		
		else if (taxBracket4 >= income && taxBracket3 < income){
			System.out.println("20% tax");
			percentageTaxes = (float) (income*(20.0f/100.0f));
			System.out.println("Amount of tax: " + "£" + percentageTaxes + " in taxes");
		}
		
		else {
			System.out.println ("25% tax");
			percentageTaxes = (float) (income*(25.0f/100.0f));
			System.out.println("Amount of tax: " + "£" + percentageTaxes + " in taxes");
		}
		}
	
	
	
	
	
	
	}

	
