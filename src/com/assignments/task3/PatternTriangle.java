package com.assignments.task3;

import java.util.Scanner;

public class PatternTriangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of levels in the pattern: ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = n - i - 1; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		scanner.close();
	}

}
