package com.assignments.task4;

import java.util.Scanner;

public class CheckEqualityOfArrays {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of first array: ");
		int n1 = scanner.nextInt();
		System.out.print("Enter the size of second array: ");
		int n2 = scanner.nextInt();

		if (n1 != n2) {
			System.out.println("Arrays are NOT equal (Different lengths)");
			System.exit(n1);
		}

		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];

		System.out.println("Enter elements for first array:");
		for (int i = 0; i < n1; i++) {
			arr1[i] = scanner.nextInt();
		}

		System.out.println("Enter elements for second array:");
		for (int i = 0; i < n2; i++) {
			arr2[i] = scanner.nextInt();
		}

		boolean areEqual = true;
		for (int i = 0; i < n1; i++) {
			if (arr1[i] != arr2[i]) {
				areEqual = false;
				break;
			}
		}

		if (areEqual) {
			System.out.println("Arrays are EQUAL.");
		} else {
			System.out.println("Arrays are NOT EQUAL.");
		}

		scanner.close();
	}

}
