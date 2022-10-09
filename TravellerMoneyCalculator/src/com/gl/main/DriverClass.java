package com.gl.main;

import java.util.Scanner;

import com.gl.service.Calculator;

public class DriverClass {

	// Main method class to initiate the program
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);

		int noOfDenomination;

		System.out.println("enter the size of currency denominations");
		noOfDenomination = scanner.nextInt();

		System.out.println("enter the currency denomination value");
		int[] array = new int[noOfDenomination];
		for (int i = 0; i < noOfDenomination; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("enter the amount you want to pay");
		int amount = scanner.nextInt();

		// Calling method to sort the random order to decreasing order
		calculator.bubbleSort(array);

		// Calling method to Count and make exact payment
		calculator.noOfNotes(array, amount);

		scanner.close();

	}

}
