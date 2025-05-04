package com.assignments.task7;

import java.util.Scanner;

public class IsAmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		int original = num;
		int sum = 0;
		int digits = String.valueOf(num).length();

		while (num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, digits);
			num /= 10;
		}

		if (sum == original) {
			System.out.println(num + " is an Armstrong number.");
		} else {
			System.out.println(num + " is NOT an Armstrong number.");
		}

		scanner.close();

	}

}
