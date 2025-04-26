package com.assignments.task3;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		boolean prime = false;
		
		if (num == 0 || num == 1) {
			prime = true;
		}

		for (int i = 2; i <= num / 2; ++i) {

			if (num % i == 0) {
				prime = true;
				break;
			}
		}

		if (!prime)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");

		scanner.close();
	}

}
