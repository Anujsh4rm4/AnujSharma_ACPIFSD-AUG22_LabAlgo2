package com.gl.main;

import java.util.Scanner;

import com.gl.service.Transaction;

public class Main {

	// Main method class to initiate the program	
	public static void main(String[] args) {
		Transaction transaction = new Transaction(); 
		Scanner scanner = new Scanner(System.in);
		int sizeOfArray; 
		
		System.out.println("enter the size of transaction array");
		sizeOfArray = scanner.nextInt();
		
		System.out.println("enter the value of array");
		int[] array =new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			array[i]=scanner.nextInt();
		}
		
		System.out.println("enter the total number of targets that need to be achieve");
		int noOfTarget = scanner.nextInt();
		
		for (int i = 0; i < noOfTarget; i++) {
			System.out.println("enter the value of target");
			int valueOfTransaction = scanner.nextInt();
			
			// Calling method to count and compare
			transaction.isTargetAchievable(valueOfTransaction, array);
		}
		
		scanner.close();
	}

}
