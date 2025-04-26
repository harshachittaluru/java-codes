package com.assignments.task3;

import java.util.Scanner;

public class SmallestLargestNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		String choice;

		do {
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();

			if (num > largest) {
				largest = num;
			}
			if (num < smallest) {
				smallest = num;
			}

			System.out.print("Do you want to enter another number? (yes/no/y/n): ");
			choice = scanner.next();

		} while (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"));

		System.out.println("Largest number entered: " + largest);
		System.out.println("Smallest number entered: " + smallest);

		scanner.close();
	}
}

