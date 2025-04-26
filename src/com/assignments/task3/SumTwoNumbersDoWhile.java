package com.assignments.task3;

import java.util.Scanner;

public class SumTwoNumbersDoWhile {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String needOperationAgain;

		do {
			System.out.print("Enter the first number: ");
			int num1 = scanner.nextInt();

			System.out.print("Enter the second number: ");
			int num2 = scanner.nextInt();

			int sum = num1 + num2;
			System.out.println("The sum is: " + sum);

			System.out.print("Do you want to add two more numbers? (yes/no/y/n): ");
			needOperationAgain = scanner.next();
		} while (needOperationAgain.equalsIgnoreCase("yes") || needOperationAgain.equalsIgnoreCase("y"));

		scanner.close();
	}
}

